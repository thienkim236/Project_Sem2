/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBEntities;

import java.util.Vector;

public class QA {
//    public String dapan,anh,diem;
//
//    public QA(String dapan, String anh,String diem) {
//        this.dapan = dapan;
//        this.anh = anh;
//        this.diem = diem;
//    }
    
    public String quesContent, ansContent;
    public int quesId,quesGem,quesScore;

    public QA() {
    }

    public QA(String quesContent, String ansContent, int quesId, int quesGem, int quesScore) {
        this.quesId = quesId;
        this.quesContent = quesContent;
        this.ansContent = ansContent;
        this.quesGem = quesGem;
        this.quesScore = quesScore;
    }
    
    public Vector toVector(){
        Vector v = new Vector();
        v.add(quesId);
        v.add(quesContent);
        v.add(ansContent);
        v.add(quesGem);
        v.add(quesScore);
        return v;
    }
    
    public String getquesContent(){
        return quesContent;
    }
    public String getansContent(){
        return ansContent;
    }
    public int getquesId(){
        return quesId;
    }
    public int getquesGem(){
        return quesGem;
    }
    public int getquesScore(){
        return quesScore;
    }
    public void setquesContent(String quesContent){
        this.quesContent = quesContent;
    }
    public void setansContent(String ansContent){
        this.ansContent = ansContent;
    }
    public void setquesId(int quesId){
        this.quesId = quesId;
    }
    public void setquesGem(int quesGem){
        this.quesGem = quesGem;
    }
    public void setquesScore(int quesScore){
        this.quesScore = quesScore;
    }
}
