package defpackage;

import android.view.View;
import java.util.Collections;
import one.me.settings.ringtone.ui.SettingRingtoneScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o03 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o03(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((m20) obj3).invoke((u7a) obj2, ((p03) obj).a);
                break;
            case 1:
                ((qf7) obj3).invoke((x7a) obj2, ((x23) obj).a);
                break;
            case 2:
                ((b8f) obj3).invoke((be3) obj2, (xu2) obj);
                break;
            case 3:
                ((b8f) obj3).invoke((fm4) obj2, (izb) obj);
                break;
            case 4:
                ((m20) obj3).invoke(Long.valueOf(((lk6) obj2).a), ((nk6) obj).a);
                break;
            default:
                View view2 = ((kvf) obj2).a;
                String str = ((jbf) obj).i;
                SettingRingtoneScreen settingRingtoneScreen = (SettingRingtoneScreen) ((ks9) obj3).b;
                qp4 qp4Var = settingRingtoneScreen.e;
                if (qp4Var != null) {
                    qp4Var.dismiss();
                }
                pp4 pp4VarB = opl.b(settingRingtoneScreen, 1);
                settingRingtoneScreen.o1().getClass();
                qp4 qp4VarBuild = pp4VarB.l(Collections.singletonList(new rp4(0, new tnh(R.string.delete), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_delete), Integer.valueOf(R.attr.icon_negative)))).f(view2).p(n1g.i(new ylc("ringtone_file_path", str))).build();
                settingRingtoneScreen.e = qp4VarBuild;
                qp4VarBuild.u(settingRingtoneScreen);
                break;
        }
        return true;
    }
}
