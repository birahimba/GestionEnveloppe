/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.areyes1.jgc.nb.junit;

import java.util.List;

/**
 *
 * @author alvinreyes
 */
public class Envelope {
    
    private String envelopeId;
    private List<Message> message;

    /**
     * @return the envelopeId
     */
    public String getEnvelopeId() {
        return envelopeId;
    }

    /**
     * @param envelopeId the envelopeId to set
     */
    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    /**
     * @return the message
     */
    public List<Message> getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(List<Message> message) {
        this.message = message;
    }
    
    
}
