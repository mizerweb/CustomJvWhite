package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class kl9 extends a8j {
    public static final rxb w;
    public static final rxb x;
    public static final rxb y;
    public static final rxb z;
    public final nni c;
    public final wo6 d;
    public final ny8 e;
    public final mjg f;
    public final r8e g;
    public final mjg h;
    public final r8e i;
    public Bundle j;
    public final mjg k;
    public final r8e l;
    public final pzf m;
    public final q8e n;
    public final pzf o;
    public final q8e p;
    public final mjg q;
    public final r8e r;
    public final pzf s;
    public final q8e t;
    public final gve u;
    public final xx6 v;

    static {
        Integer numValueOf = Integer.valueOf(R.string.oneme_main_max_id_title);
        pxb pxbVar = new pxb(R.drawable.max_id_avd);
        pk9.c.getClass();
        w = new rxb(numValueOf, pxbVar, R.id.oneme_main_max_id_container, v65.a(pk9.d.a), R.id.oneme_main_max_id_bottom_item);
        x = new rxb(Integer.valueOf(R.string.oneme_main_contacts_title), new pxb(R.drawable.contacts_avd), R.id.oneme_main_contacts_container, v65.a(pk9.e.a), R.id.oneme_main_contacts_bottom_item);
        y = new rxb(Integer.valueOf(R.string.oneme_main_calls_title), new pxb(R.drawable.calls_avd), R.id.oneme_main_calls_container, v65.a(pk9.f.a), R.id.oneme_main_calls_bottom_item);
        z = new rxb(Integer.valueOf(R.string.oneme_main_chats_title), new oxb(new jl9(0), new ik4(12)), R.id.oneme_main_chats_container, v65.a(pk9.g.a), R.id.oneme_main_chats_bottom_item);
    }

    public kl9(nni nniVar, wo6 wo6Var, ny8 ny8Var, ny8 ny8Var2, tci tciVar, String str, voj vojVar, ny8 ny8Var3) {
        Object next;
        kl9 kl9Var;
        this.c = nniVar;
        this.d = wo6Var;
        this.e = ny8Var;
        lq4 lq4Var = null;
        mjg mjgVarA = p90.a(B(C(0L, null, null, false)));
        this.f = mjgVarA;
        this.g = new r8e(mjgVarA);
        rxb rxbVar = z;
        mjg mjgVarA2 = p90.a(rxbVar);
        this.h = mjgVarA2;
        this.i = new r8e(mjgVarA2);
        mjg mjgVarA3 = p90.a(Boolean.valueOf(nniVar.d.getBoolean("app.messages.calls.menu.item", true)));
        this.k = mjgVarA3;
        this.l = new r8e(mjgVarA3);
        pzf pzfVarB = e9i.b(0, 0, 6);
        this.m = pzfVarB;
        this.n = new q8e(pzfVarB);
        pzf pzfVarB2 = e9i.b(0, 0, 6);
        this.o = pzfVarB2;
        this.p = new q8e(pzfVarB2);
        mjg mjgVarA4 = p90.a(r66.a);
        this.q = mjgVarA4;
        this.r = new r8e(mjgVarA4);
        pzf pzfVarB3 = e9i.b(0, 0, 6);
        this.s = pzfVarB3;
        this.t = new q8e(pzfVarB3);
        this.u = new gve(this);
        this.v = tciVar.c;
        Iterator it = ((Iterable) mjgVarA.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((rxb) next).d.equals(str));
        rxb rxbVar2 = (rxb) next;
        mjgVarA2.setValue(rxbVar2 != null ? rxbVar2 : rxbVar);
        final nni nniVar2 = this.c;
        final gve gveVar = this.u;
        nniVar2.getClass();
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: mni
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                nni nniVar3 = nniVar2;
                nniVar3.getClass();
                if (str2 != null && str2.equals("app.messages.calls.menu.item")) {
                    qt4.C(nniVar3.d.getBoolean("app.messages.calls.menu.item", true), ((kl9) gveVar.a).k, null);
                }
            }
        };
        nniVar2.h.put(gveVar, onSharedPreferenceChangeListener);
        nniVar2.d.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        int i = 3;
        if (((y6b) ny8Var3.getValue()).d()) {
            long jT = ((s7f) ((et3) this.e.getValue())).t();
            kl9Var = this;
            e9i.j0(new fz6(((utd) ny8Var2.getValue()).c(jT), new zw9(kl9Var, jT, lq4Var, 7), i), kl9Var.b);
        } else {
            kl9Var = this;
        }
        if (((f5d) kl9Var.d).t()) {
            e9i.j0(new fz6(new uoj(vojVar.a, ((f5d) kl9Var.d).d()), new ai8(kl9Var, lq4Var, i), i), kl9Var.b);
        }
    }

    public static rxb C(long j, CharSequence charSequence, String str, boolean z2) {
        oxb oxbVar;
        if (z2) {
            oxbVar = new oxb(new jl9(1), new w03(j, charSequence, str));
        } else {
            oxbVar = new oxb(new jl9(2), new ik4(13));
        }
        oxb oxbVar2 = oxbVar;
        Integer numValueOf = Integer.valueOf(R.string.oneme_main_settings_title);
        pk9.c.getClass();
        return new rxb(numValueOf, oxbVar2, R.id.oneme_main_settings_container, v65.a(pk9.h.a), R.id.oneme_main_settings_bottom_item);
    }

    public final c79 B(rxb rxbVar) {
        c79 c79VarW = yab.w();
        f5d f5dVar = (f5d) this.d;
        if (f5dVar.t()) {
            c79VarW.add(w);
        }
        if (!f5dVar.r()) {
            c79VarW.add(x);
        }
        c79VarW.add(y);
        c79VarW.add(z);
        c79VarW.add(rxbVar);
        return yab.j(c79VarW);
    }

    @Override // defpackage.a8j
    public final void y() {
        nni nniVar = this.c;
        ry8 ry8Var = nniVar.d;
        WeakHashMap weakHashMap = nniVar.h;
        gve gveVar = this.u;
        ry8Var.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) weakHashMap.get(gveVar));
        weakHashMap.remove(gveVar);
    }
}
