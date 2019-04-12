package com.linco.chapter_01.knights;

/**
 * @ClassName BraveKnight
 * @Description 勇敢的骑士
 * @Author zbj
 * @Data 2019/4/12 16:09
 * @Version 1.0
 **/
public class BraveKnight implements Knight {
    /**
     * @Description  //引入探险接口
     **/
    private Quest quest;
    /**
     * @Author zbj
     * @Description  构造函数
     * @Date  2019/4/12 16:22
     * @Param [quest]
     * @return
     **/
    public BraveKnight(Quest quest){
        this.quest = quest;
    }
    /**
     * @Author zbj
     * @Description  //实现方法
     * @Date  2019/4/12 16:23
     * @Param []
     * @return void
     **/
    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
