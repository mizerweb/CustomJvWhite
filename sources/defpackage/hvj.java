package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hvj implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ hvj(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(Widget.viewBinding$lambda$2(widget, (View) obj));
            default:
                int i2 = uw8.a;
                Context context = widget.getContext();
                mjg mjgVar = uw8.e;
                exj exjVar = ((ixj) obj).a;
                int i3 = exjVar.f(8).d - exjVar.f(519).d;
                if (uw8.c != i3) {
                    gm0.n(uw8.class.getName(), "insets changed keyboard height=" + i3);
                    if (uw8.b(i3)) {
                        String str = hsl.a(context) ? "pref_keyboard_height_portrait" : "pref_keyboard_height_landscape";
                        uw8.b.e(i3, str);
                        SharedPreferences sharedPreferences = uw8.d;
                        if (sharedPreferences == null) {
                            sharedPreferences = context.getApplicationContext().getSharedPreferences("keyboard_prefs", 0);
                        }
                        if (uw8.d == null) {
                            uw8.d = sharedPreferences;
                        }
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putInt(str, i3);
                        editorEdit.apply();
                    }
                    if (uw8.b(i3)) {
                        Boolean bool = Boolean.TRUE;
                        mjgVar.getClass();
                        mjgVar.j(null, bool);
                    } else if (uw8.b(uw8.c)) {
                        Boolean bool2 = Boolean.FALSE;
                        mjgVar.getClass();
                        mjgVar.j(null, bool2);
                    }
                    uw8.c = i3;
                }
                return sbi.a;
        }
    }
}
