package Tankesmedjan.TSWebShop.entity;

import javax.persistence.*;

@Entity
@Table(name="Feedback")
public class FeedbackEntity {

    private int feedbackId;
    private String feedbackMessage;
    private String feedbackEmail;


    public FeedbackEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getFeedbackId(){ return feedbackId; }

    public void setFeedbackId(int feedbackId) { this.feedbackId = feedbackId; } //AUTO_INCREMENT

    public String getFeedbackMessage(){ return feedbackMessage; }

    public void setFeedbackMessage(String feedbackMessage){ this.feedbackMessage = feedbackMessage; }

    public String getFeedbackEmail() { return feedbackEmail; }

    public void setFeedbackEmail(String feedbackEmail){ this.feedbackEmail = feedbackEmail;}
}
