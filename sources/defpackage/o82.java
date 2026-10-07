package defpackage;

import java.io.Serializable;
import java.util.List;
import org.apache.http.HttpStatus;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class o82 extends mdh implements wf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public /* synthetic */ Object g;
    public /* synthetic */ Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o82(Object obj, lq4 lq4Var, int i) {
        super(5, lq4Var);
        this.e = i;
        this.j = obj;
    }

    @Override // defpackage.wf7
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Object obj5 = this.j;
        switch (i) {
            case 0:
                o82 o82Var = new o82((x02) obj5, (lq4) serializable, 0);
                o82Var.f = (dz4) obj;
                o82Var.g = (enc) obj2;
                o82Var.h = (be1) obj3;
                o82Var.i = (k52) obj4;
                return o82Var.invokeSuspend(sbiVar);
            default:
                o82 o82Var2 = new o82((euf) obj5, (lq4) serializable, 1);
                o82Var2.f = (ylc) obj;
                o82Var2.g = (et9) obj2;
                o82Var2.h = (ynh) obj3;
                o82Var2.i = (List) obj4;
                return o82Var2.invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                dz4 dz4Var = (dz4) this.f;
                enc encVar = (enc) this.g;
                be1 be1Var = (be1) this.h;
                k52 k52Var = (k52) this.i;
                ch3.d0(obj);
                return new l9(((x02) this.j).s(), dz4Var, encVar, be1Var, k52Var);
            default:
                ylc ylcVar = (ylc) this.f;
                et9 et9Var = (et9) this.g;
                ynh ynhVar = (ynh) this.h;
                List list = (List) this.i;
                ch3.d0(obj);
                ebf ebfVar = (ebf) ylcVar.a;
                List list2 = (List) ylcVar.b;
                c79 c79VarW = yab.w();
                if (ebfVar != null) {
                    c79VarW.add(ebfVar);
                }
                zv8[] zv8VarArr = euf.z;
                c79VarW.addAll(xw3.P0(new bbf(1, new tnh(R.string.oneme_settings_media_preserve_cache_title), 0, R.id.oneme_settings_media_screen_preserve_media_section, (osf) null, new tnh(R.string.oneme_settings_media_preserve_cache_desc), new isf(et9Var != null ? new tnh(et9Var.c) : ynh.b, null), (bz8) null, HttpStatus.SC_BAD_REQUEST), new bbf(3, new tnh(R.string.oneme_settings_media_memory_usage_title), 0, R.id.oneme_settings_media_screen_memory_usage_section, (osf) null, (tnh) null, new isf(ynhVar, null), (bz8) null, 432)));
                c79VarW.addAll(list2);
                c79VarW.addAll(list);
                return yab.j(c79VarW);
        }
    }
}
