package com.besiktasshipyard.mobile.btys.busEvents;

/**
 * Created by aliarin on 16.6.2017.
 */

public class onGetUserById implements iBusEvent {
    private Object _data, _error;

    public onGetUserById() {
    }


    public void setData(Object data)
    {
        _data = data;
    }

    public Object getData() {
        return _data;
    }

    public void setError(Object error)
    {
        _error = error;
    }

    public Object getError() {
        return _error;
    }
}
