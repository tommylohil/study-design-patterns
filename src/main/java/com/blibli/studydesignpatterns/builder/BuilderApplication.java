package com.blibli.studydesignpatterns.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BuilderApplication {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Mahasiswa {

        private String nim;
        private String nama;
        private String alamat;
        private Date tanggallahir;
        private List<String> hobi;

    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNim("181401067");
        mahasiswa1.setNama("Tommy");
        mahasiswa1.setAlamat("Indonesia");
        mahasiswa1.setTanggallahir(new Date());
        mahasiswa1.setHobi(Arrays.asList("Makan","Jalan-jalan"));

        Mahasiswa mahasiswa2 = Mahasiswa.builder()
                .nim("181401067")
                .nama("Lohil")
                .alamat("Indonesia")
                .tanggallahir(new Date())
                .hobi(Arrays.asList("Makan","Jalan-jalan"))
                .build();

        System.out.println(mahasiswa1);
        System.out.println(mahasiswa2);
        System.out.println(mahasiswa1.equals(mahasiswa2));
    }
}
