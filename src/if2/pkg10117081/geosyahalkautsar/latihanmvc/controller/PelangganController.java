/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10117081.geosyahalkautsar.latihanmvc.controller;

import if2.pkg10117081.geosyahalkautsar.latihanmvc.model.PelangganModel;
import if2.pkg10117081.geosyahalkautsar.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * KELAS : PBO2/IF2
 * 
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtNoTelepon().getText();
        
        if(nama.equals("") && email.equals("") && noTelp.equals("")){
            
        }else {
          model.resetForm();
        }
    }
    
    public void simpanForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtNoTelepon().getText();
        
        if(nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");  
        } else if(noTelp.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nomor Telepon Masih Kosong");  
        } else {
            model.simpanForm();
        }
    }
}
