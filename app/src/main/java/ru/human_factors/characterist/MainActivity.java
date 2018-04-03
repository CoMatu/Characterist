package ru.human_factors.characterist;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ru.human_factors.characterist.fragments.CompFragment;
import ru.human_factors.characterist.fragments.ItemFragment;
import ru.human_factors.characterist.fragments.ItemFragment.OnListFragmentInteractionListener;
import ru.human_factors.characterist.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements OnListFragmentInteractionListener{
    ItemFragment listFragment;
    CompFragment compFragment;
    FragmentTransaction fTrans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        listFragment = new ItemFragment();
        compFragment = new CompFragment();
        fTrans = getSupportFragmentManager()
                .beginTransaction();
        fTrans.add(R.id.container, compFragment);
        fTrans.commit();

    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
