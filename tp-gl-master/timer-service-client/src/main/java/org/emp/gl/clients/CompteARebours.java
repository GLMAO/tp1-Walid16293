package org.emp.gl.clients;

import org.emp.gl.timer.service.TimerChangeListener;
import org.emp.gl.timer.service.TimerService ;


public class CompteARebours implements TimerChangeListener{

    String name;
    int compte;
    public void setTimerService(TimerService timerService) {
        this.timerService = timerService;

    }

    TimerService timerService;


    public CompteARebours(String name, TimerService timerService, int c) {
        this.name = name;
        this.timerService = timerService;
        this.compte = c;
        System.out.println("Horloge " + name + " initialized!");
    }

    public void afficherHeure() {
        if (timerService != null)
            System.out.println(name + " affiche " + timerService.getHeures() + ":" + timerService.getMinutes() + ":" + timerService.getSecondes() +" , "+timerService.getDixiemeDeSeconde());
    }

    public void propertyChange(String propertyName, Object oldValue, Object newValue) {
        afficherHeure();
    }
}
