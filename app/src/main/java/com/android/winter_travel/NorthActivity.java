package com.android.winter_travel;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.android.winter_travel.adapter.RecyclerViewAdapter2;
import com.android.winter_travel.model.Place;

import java.util.ArrayList;
import java.util.List;

public class NorthActivity extends AppCompatActivity {


    private List<Place> mPlaceList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north);

        populateData();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        RecyclerViewAdapter2 adapter = new RecyclerViewAdapter2(
                NorthActivity.this,
                R.layout.item_place2,
                mPlaceList
        );

        LinearLayoutManager lm = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);

        recyclerView.setLayoutManager(new LinearLayoutManager(NorthActivity.this));
        //recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);


    }

    private void populateData() {
        Place place = new Place("Pang Ung","Mae Hong Son", R.drawable.pang1, R.drawable.pang2,"       ปางอุ๋ง สถานที่ท่องเที่ยวมาแรง ยอดฮิต ของจังหวัดแม่ฮ่องสอน จนได้รับขนานนาม ว่าเป็น “สวิตเซอร์แลนด์แห่งเมืองเหนือ” มีลักษณะพื้นที่เป็นอ่างเก็บน้ำขนาดใหญ่บนยอดเขาสูง ริมอ่างเก็บน้ำเป็นทิวสนที่ปลูกเรียงราย ปกคลุมร่มรื่นทั่วบริเวณ ถนนทางเข้ามีราชพฤกษ์ต้นใหญ่ ชูช่อดอกสีเหลืองโน้มลงมาต้อนรับผู้มาเยือนตลอดทาง สร้างความสุขให้เราได้ตั้งแต่ก้าวแรกที่มาเยือน ไฮไลท์สำคัญคือการตื่นมาดูพระอาทิตย์ขึ้นตัดกับไอหมอกสวยงามจับตา");
        mPlaceList.add(place);

        place = new Place("Phu Lang Ka","Phayao", R.drawable.poolangka1, R.drawable.poolangka2,"      วนอุทยานภูลังกา คือ อีกหนึ่งแหล่งท่องเที่ยว ที่มีชื่อเสียงของอำเภอเชียงคำ และอำเภอปง จังหวัดพะเยา สูงจากระดับน้ำทะเลประมาณ 900-1,720 เมตร มีลักษณะเป็นภูเขาสูงชันอยู่ในเทือกเขาสันปันน้ำ วางตัวอยู่ในแนวตะวันออก-ตะวันตก คล้ายแอ่งกระทะ ช่วงเช้ามีโอกาสเห็นทะเลหมอกลอยอยู่ทั่วบริเวณ เป็นภาพงดงามเหนือคำบรรยาย โดยสถานที่ท่องเที่ยวบนภูลังกาที่ไม่ควรพลาด คือ “ภูเทวดา” เป็นยอดดอยที่สูงที่สุดในเทือกเขาสันปันน้ำ ไทย-ลาว เป็นจุดชมทะเลเมฆหมอก ดวงอาทิตย์ขึ้นลงและดอกไม้ป่าอันสวยงาม");
        mPlaceList.add(place);

        place = new Place("Doi Mon Jong","Chiang Mai", R.drawable.doimonjong2, R.drawable.doimonjong1,"       ดอยม่อนจอง ตั้งอยู่ในเขตลึกของป่าอมก๋อย จ.เชียงใหม่ ทิศตะวันออกจรดเขื่อนภูมิพล ทิศตะวันตกติดกับถนนสายอมก๋อย-บ้านแม่ตื่น ทิศเหนือจรดกับพื้นที่อำเภอดอยเต่า ทิศใต้จรดกับลำห้วยแม่ตื่นที่ไหลลงสู่เขื่อนภูมิพล สูงติดอันดับ 1 ใน 10 ของยอดดอยที่สูงที่สุดในประเทศไทย จุดสูงสุดของ ดอยม่อนจอง เรียกว่า หัวสิงห์ เพราะมีลักษณะคล้ายหัวสิงโต ดอยม่อนจอง เป็นสถานที่ชมพระอาทิตย์ขึ้น พระอาทิตย์ตก ที่สวยงามมากอีกแห่งหนึ่ง แถมยามค่ำคืนยังสามารถนอนคุดคู้นับดาวกันตัวสั่น เพราะอากาศบนนั้นหนาวเอาเรื่องเลยล่ะฮะ");
        mPlaceList.add(place);

        // place = new Place("ตลาดท่านา","นครชัยศรี",R.drawable.thana);
//
        //  place = new Place("ตลาดน้ำลำพญา","บางเลน",R.drawable.lam);
        //  mPlaceList.add(place);

    }
}

