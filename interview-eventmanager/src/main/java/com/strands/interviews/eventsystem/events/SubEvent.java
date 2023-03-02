package com.strands.interviews.eventsystem.events;

public class SubEvent extends SimpleEvent
{
    private Object source;

    public SubEvent(Object source)
    {
        super(source);
    }

    public Object getSource()
    {
        return source;
    }

    public void setSource(Object source)
    {
        this.source = source;
    }
}