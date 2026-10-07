package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import one.me.settings.SettingsAvatarBottomSheet;

/* JADX INFO: loaded from: classes3.dex */
public final class jqf extends LinearLayout implements eph {
    public final AppCompatTextView a;
    public final AppCompatTextView b;
    public final LinkedHashMap c;

    public jqf(SettingsAvatarBottomSheet settingsAvatarBottomSheet, CharSequence charSequence, CharSequence charSequence2, ArrayList arrayList, Context context) {
        AppCompatTextView appCompatTextView;
        super(context);
        zv8[] zv8VarArr = SettingsAvatarBottomSheet.y;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext());
        q9i.a(q9i.c, appCompatTextView2);
        appCompatTextView2.setText(charSequence);
        appCompatTextView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        vv vvVar = settingsAvatarBottomSheet.v;
        zv8 zv8Var = SettingsAvatarBottomSheet.y[1];
        layoutParams.bottomMargin = ((ynh) vvVar.a(settingsAvatarBottomSheet)) == null ? gm0.K(yl5.d().getDisplayMetrics().density * 16.0f) : gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        addView(appCompatTextView2, layoutParams);
        this.a = appCompatTextView2;
        if (charSequence2 != null) {
            appCompatTextView = new AppCompatTextView(getContext());
            q9i.a(q9i.i, appCompatTextView);
            appCompatTextView.setText(charSequence2);
            appCompatTextView.setGravity(17);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            layoutParams2.bottomMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
            addView(appCompatTextView, layoutParams2);
        } else {
            appCompatTextView = null;
        }
        this.b = appCompatTextView;
        int iP0 = wm9.P0(yw3.W0(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP0 < 16 ? 16 : iP0);
        for (Object obj : arrayList) {
            iqf iqfVar = (iqf) obj;
            int i = iqfVar.a;
            CharSequence charSequenceB = iqfVar.b.b(getContext());
            AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext());
            q9i.a(q9i.p, appCompatTextView3);
            appCompatTextView3.setText(charSequenceB);
            appCompatTextView3.setGravity(17);
            qe7.H(appCompatTextView3, 300L, new gwc(settingsAvatarBottomSheet, i));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 17;
            layoutParams3.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 15.0f);
            layoutParams3.bottomMargin = gm0.K(15.0f * yl5.d().getDisplayMetrics().density);
            addView(appCompatTextView3, layoutParams3);
            linkedHashMap.put(appCompatTextView3, obj);
        }
        this.c = linkedHashMap;
        setOrientation(1);
        setGravity(17);
        onThemeChanged(pq3.j.h(this));
    }

    public final Map<TextView, iqf> getButtonViews() {
        return this.c;
    }

    public final TextView getDescriptionView() {
        return this.b;
    }

    public final TextView getTitleView() {
        return this.a;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int i;
        this.a.setTextColor(kbcVar.getText().b);
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(kbcVar.getText().d);
        }
        for (Map.Entry entry : this.c.entrySet()) {
            TextView textView = (TextView) entry.getKey();
            int iD = qt4.D(((iqf) entry.getValue()).c);
            if (iD == 0) {
                i = kbcVar.getText().h;
            } else {
                if (iD != 1) {
                    ore.o();
                    return;
                }
                i = kbcVar.getText().c;
            }
            textView.setTextColor(i);
        }
    }
}
