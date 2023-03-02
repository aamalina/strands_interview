package com.strands.interviews.eventsystem.events;

public class CreationEvent extends SimpleEvent implements Creation
{
    public CreationEvent(Object source)
    {
        super(source);
    }

    private Object source;

    public Object getSource()
    {
        return source;
    }

    public void setSource(Object source)
    {
        this.source = source;
    }
}