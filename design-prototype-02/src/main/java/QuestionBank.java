/*
 * Copyright 2021 Gypsophila open source organization.
 *
 * Licensed under the Apache License,Version2.0(the"License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import prototype.AnswerQuestion;
import prototype.ChoiceQuestion;
import util.Topic;
import util.TopicRandomUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 * @author lixiaoshuang
 */
public class QuestionBank implements Cloneable {
    
    private String candidate; // 考生
    
    private String number;    // 考号
    
    private ArrayList<ChoiceQuestion> choiceQuestionList = new ArrayList<>();
    
    private ArrayList<AnswerQuestion> answerQuestionList = new ArrayList<>();
    
    public QuestionBank append(ChoiceQuestion choiceQuestion) {
        choiceQuestionList.add(choiceQuestion);
        return this;
    }
    
    public QuestionBank append(AnswerQuestion answerQuestion) {
        answerQuestionList.add(answerQuestion);
        return this;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        QuestionBank questionBank = (QuestionBank) super.clone();
        questionBank.choiceQuestionList = (ArrayList<ChoiceQuestion>) choiceQuestionList.clone();
        questionBank.answerQuestionList = (ArrayList<AnswerQuestion>) answerQuestionList.clone();
        
        // 题目乱序
        Collections.shuffle(questionBank.choiceQuestionList);
        Collections.shuffle(questionBank.answerQuestionList);
        // 答案乱序
        ArrayList<ChoiceQuestion> choiceQuestionList = questionBank.choiceQuestionList;
        for (ChoiceQuestion question : choiceQuestionList) {
            Topic random = TopicRandomUtil.random(question.getOption(), question.getKey());
            question.setOption(random.getOption());
            question.setKey(random.getKey());
        }
        return questionBank;
    }
    
    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    @Override
    public String toString() {
        
        StringBuilder detail = new StringBuilder("考生：" + candidate + "\r\n" + "考号：" + number + "\r\n"
                + "--------------------------------------------\r\n" + "一、选择题" + "\r\n\n");
        
        for (int idx = 0; idx < choiceQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(choiceQuestionList.get(idx).getName())
                    .append("\r\n");
            Map<String, String> option = choiceQuestionList.get(idx).getOption();
            for (String key : option.keySet()) {
                detail.append(key).append("：").append(option.get(key)).append("\r\n");
                ;
            }
            detail.append("答案：").append(choiceQuestionList.get(idx).getKey()).append("\r\n\n");
        }
        
        detail.append("二、问答题" + "\r\n\n");
        
        for (int idx = 0; idx < answerQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(answerQuestionList.get(idx).getName())
                    .append("\r\n");
            detail.append("答案：").append(answerQuestionList.get(idx).getKey()).append("\r\n\n");
        }
        
        return detail.toString();
    }
}
