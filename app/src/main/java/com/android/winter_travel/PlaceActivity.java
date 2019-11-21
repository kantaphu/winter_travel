package com.android.winter_travel;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.android.winter_travel.adapter.RecyclerViewAdapter;
import com.android.winter_travel.model.Place;

import java.util.ArrayList;
import java.util.List;

public class PlaceActivity extends AppCompatActivity {

    private List<Place> mPlaceList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        populateData();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(
                PlaceActivity.this,
                R.layout.item_place,
                mPlaceList
        );

        LinearLayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);

        recyclerView.setLayoutManager(new LinearLayoutManager(PlaceActivity.this));
        //recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);


    }

    private void populateData() {
        Place place = new Place("The Sea of Mist Ai Yerweng","Yala", R.drawable.ayerweng, R.drawable.ayerweng2,"        ทะเลหมอกอัยเยอร์เวง  ตั้งอยู่ที่ตำบลอัยเยอร์เวง อำเภอเบตง จังหวัดยะลา เป็นจุดชมวิวทะเลหมอกยอดฮิตของเบตงที่เดินทางสะดวกรถขึ้นถึง และมีทะเลหมอกให้ชมตลอดทั้งปี ทะเลหมอกอัยเยอร์เวง  ตั้งอยู่ห่างจากตัวอำเภอเบตง ประมาณ 40 กิโลเมตร ในพื้นที่ของเขาไมโครเวฟ มีความสูงจากระดับน้ำทะเล 2,038 เมตร เป็นทะเลหมอกที่ใหญ่และสวยงาม ในช่วงเวลาเช้าจุดชมวิวแห่งนี้จะกลายเป็นสวรรค์บนดินเปิดให้นักท่องเที่ยวเต็มอิ่มกับทะเลหมอก  สัมผัสอากาศอันบริสุทธิ์ และทัศนียภาพที่สวยงามของยอดเขาไมโครเวฟ");
        mPlaceList.add(place);

        place = new Place("Bannaimong Treehouse","Ranong", R.drawable.bannaimong, R.drawable.bannaimong2,"        บ้านในหมง TREEHOUSE ตั้งอยู่ที่ จ. ระนอง โฮมสเตย์เล็กๆ ที่ตั้งอยู่ท่ามกลางธรรมชาติ ต้นไม้ และลำธารใส ห้องพักของ บ้านในหมง Treehouse มีดีไซน์ไม่เหมือนใคร เช่น กระท่อมไม้สน Eco cabin (พัดลม) มีระเบียงวิวลำธารด้านหน้า และวิวสวนด้านหลัง พร้อมชั้นลอยสำหรับการพักผ่อนอย่างเป็นส่วนตัว, บ้านระเบียงน้ำตก, บ้านวิวภูเขา และโซนที่พักใหม่อย่าง กระโจม Canvas พร้อมห้องน้ำส่วนตัว");
        mPlaceList.add(place);

        place = new Place("Cheow Lan Dam","Surat Thani", R.drawable.cheowlan, R.drawable.cheowlan2,"      เขื่อนเชี่ยวหลาน จ.สุราษฎร์ธานี ปัจจุบันที่นี่มีแพคเกจทัวร์ ทั้งทริปสั้น และทริปยาวออกมาวางขายมากมาย แถมไปง่ายๆ ชิลล์ๆ กว่าแต่ก่อนเยอะ ที่พักบนเขื่อนก็มีให้เลือกหลากหลายราคาตั้งแต่หลักร้อยไปจนถึงหลักหมื่น");
        mPlaceList.add(place);


    }
}