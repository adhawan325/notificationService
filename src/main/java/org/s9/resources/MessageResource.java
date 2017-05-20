package org.s9.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.s9.domain.Message;

@Path("messages")
public class MessageResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages() {

      List<Message> messages = new ArrayList<Message>();

      Message m1 = new Message("01", "Hello");
      Message m2 = new Message("02", "I am here!");
      Message m3 = new Message("03", "Where are you?");

      messages.add(m1);
      messages.add(m2);
      messages.add(m3);

      return messages;
    }
}