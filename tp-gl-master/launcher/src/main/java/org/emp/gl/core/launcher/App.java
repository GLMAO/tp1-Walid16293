package org.emp.gl.core.launcher;

import org.emp.gl.clients.Horloge ;
import org.emp.gl.time.service.impl.DummyTimeServiceImpl;
import org.emp.gl.timer.service.TimerChangeListener;
import org.emp.gl.timer.service.TimerService;

public class App {

    public static void main(String[] args) {
        TimerService timer= new DummyTimeServiceImpl();
        TimerChangeListener horloge = new Horloge("Horloge_1 ",timer);
        timer.addTimeChangeListener(horloge);


    }

}
