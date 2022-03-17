package de.fherfurt.organization.forum;

import java.util.ArrayList;

public class Question {
    private Message message;
    private String topic;
    private ArrayList<Answer> answers;

    public Question(String topic, String title, String text, String author) {
        this.message = new Message(title, text, author);
        this.topic = topic;
        this.answers = new ArrayList<>();
    }

    public void addAnswer (String title, String text, String author){
        this.answers.add(new Answer(title, text, author));
    }

    public String getTitle() {
        return this.message.getTitle();
    }

    public boolean removeAnswer (String title){
        for(int i = 0; i < this.answers.size(); i++){
            if(this.answers.get(i).getTitle().equals(title)){
                this.answers.remove(i);
                return true;
            }
        }
        return false;
    }
}