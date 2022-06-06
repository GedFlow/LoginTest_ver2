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
import android.widget.TextView;

public class Cafeteria extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;

    private Fragcafe_budorm budorm;
    private Fragcafe_global global;
    private Fragcafe_kyosu kyosu;
    private Fragcafe_winter winter;

    Button btnCategory;
    TextView txtCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafeteria);

        btnCategory = (Button) findViewById(R.id.category);
        txtCategory = (TextView) findViewById(R.id.categoryName);

        fragmentManager = getSupportFragmentManager();

        budorm = new Fragcafe_budorm();
        global = new Fragcafe_global();
        kyosu = new Fragcafe_kyosu();
        winter = new Fragcafe_winter();

        txtCategory.setText("교수회관");
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.framelayout, kyosu).commitAllowingStateLoss();

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
//                            case R.id.action_bonbu:
//                                txtCategory.setText("본부동 식당");
//                                transaction.replace(R.id.framelayout, bonbu).commitAllowingStateLoss();
//                                break;

                            case R.id.action_kyosu:
                                txtCategory.setText("교수회관");
                                transaction.replace(R.id.framelayout, kyosu).commitAllowingStateLoss();
                                break;

                            case R.id.action_winter:
                                txtCategory.setText("밀겨울");
                                transaction.replace(R.id.framelayout, winter).commitAllowingStateLoss();
                                break;
                            case R.id.action_budorm:
                                txtCategory.setText("백석생활관 식당");
                                transaction.replace(R.id.framelayout, budorm).commitAllowingStateLoss();
                                break;
                            case R.id.action_global:
                                txtCategory.setText("글로벌외식관");
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