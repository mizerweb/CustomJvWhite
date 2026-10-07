package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;
import java.util.Locale;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nrk {
    public static final void a(rcc rccVar, kbc kbcVar, final af7 af7Var, final af7 af7Var2) {
        rccVar.setId(R.id.media_editor_toolbar);
        rccVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        rccVar.setPadding(rccVar.getPaddingLeft(), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), rccVar.getPaddingRight(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        rccVar.setCustomTheme(kbcVar);
        Integer numValueOf = Integer.valueOf(R.attr.text_primary);
        final int i = 0;
        cf7 cf7Var = new cf7() { // from class: px9
            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i2 = i;
                sbi sbiVar = sbi.a;
                af7 af7Var3 = af7Var;
                switch (i2) {
                    case 0:
                        af7Var3.invoke();
                        break;
                    default:
                        af7Var3.invoke();
                        break;
                }
                return sbiVar;
            }
        };
        final int i2 = 1;
        rccVar.setLeftActions(new zbc(new hcc(R.drawable.icon_undo, true, numValueOf, cf7Var)));
        rccVar.setRightActions(new ecc(rccVar.getContext().getString(R.string.oneme_avatar_crop_reset).toUpperCase(Locale.ROOT), numValueOf, new cf7() { // from class: px9
            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i3 = i2;
                sbi sbiVar = sbi.a;
                af7 af7Var3 = af7Var2;
                switch (i3) {
                    case 0:
                        af7Var3.invoke();
                        break;
                    default:
                        af7Var3.invoke();
                        break;
                }
                return sbiVar;
            }
        }));
    }

    public static final Activity b(hve hveVar) {
        Activity activityD = hveVar.d();
        if (activityD != null) {
            return activityD;
        }
        ore.p("Required value was null.");
        return null;
    }
}
