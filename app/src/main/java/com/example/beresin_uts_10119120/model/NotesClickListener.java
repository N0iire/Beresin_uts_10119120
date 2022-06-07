package com.example.beresin_uts_10119120.model;
/**
 * NIM : 10119120
 * NAMA : REICHAN MUHAMMAD MAULANA
 * KELAS : IF3
 * **/
import androidx.cardview.widget.CardView;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}