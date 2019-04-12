package com.linco.chapter_01.knights;

import java.io.PrintStream;

/**
 * @ClassName SlayDragonQuest
 * @Description 探险恶龙
 * @Author zbj
 * @Data 2019/4/12 16:10
 * @Version 1.0
 **/
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
