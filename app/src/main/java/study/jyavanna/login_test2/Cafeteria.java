package study.jyavanna.login_test2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class Cafeteria extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private Fragcafe_bonbu bonbu;
    private Fragcafe_budorm budorm;
    private Fragcafe_global global;
    private Fragcafe_kyosu kyosu;
    private Fragcafe_winter winter;

    Button btnCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafeteria);

        btnCategory = (Button) findViewById(R.id.category);

        fragmentManager = getSupportFragmentManager();

        bonbu = new Fragcafe_bonbu();
        budorm = new Fragcafe_budorm();
        global = new Fragcafe_global();
        kyosu = new Fragcafe_kyosu();
        winter = new Fragcafe_winter();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.framelayout, bonbu).commitAllowingStateLoss();

        btnCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                final PopupMenu popupMenu = new PopupMenu(getApplicationContext(), view);
                getMenuInflater().inflate(R.menu.popup, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        transaction = fragmentManager.beginTransaction();

                        switch (menuItem.getItemId()) {
                            case R.id.action_bonbu:
                            transaction.replace(R.id.framelayout, bonbu).commitAllowingStateLoss();
                            break;

                            case R.id.action_kyosu:
                                transaction.replace(R.id.framelayout, kyosu).commitAllowingStateLoss();
                                break;

                            case R.id.action_winter:
                                transaction.replace(R.id.framelayout, winter).commitAllowingStateLoss();
                                break;
                            case R.id.action_budorm:
                                transaction.replace(R.id.framelayout, budorm).commitAllowingStateLoss();
                                break;
                            case R.id.action_global:
                                transaction.replace(R.id.framelayout, global).commitAllowingStateLoss();
                                break;
                            default:
                                break;
                        }

                        return false;
                    }
                });
                popupMenu.show();
            }
        });

    }

}