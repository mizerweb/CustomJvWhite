package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class nyd extends a8j {
    public final String c;
    public final long d;
    public final ha9 e;
    public final String f = nyd.class.getName();
    public final ic6 g = new ic6(null);
    public final ic6 h = new ic6(null);
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final pzf m;
    public final bye n;
    public final mjg o;
    public final r8e p;
    public sgg q;
    public final int[] r;
    public final mjg s;
    public final r8e t;
    public m8b u;
    public m8b v;
    public long w;

    public nyd(String str, long j, int i, ha9 ha9Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.c = str;
        this.d = j;
        this.e = ha9Var;
        this.i = ny8Var;
        this.j = ny8Var2;
        this.k = ny8Var3;
        this.l = ny8Var4;
        boolean z = j != 0;
        pzf pzfVarB = e9i.b(1, Integer.MAX_VALUE, 4);
        this.m = pzfVarB;
        this.n = new bye(new lyd(new q8e(pzfVarB), null, 0));
        long j2 = (z && v1h.c(i, 2)) ? R.id.oneme_stories_preset_whitelist_my_contacts_item : R.id.oneme_stories_preset_whitelist_all_item;
        long j3 = R.id.oneme_stories_preset_whitelist_all_item;
        hyd hydVar = new hyd(j3, new tnh(R.string.all), j2 == j3);
        long j4 = R.id.oneme_stories_preset_whitelist_my_contacts_item;
        mjg mjgVarA = p90.a(xw3.P0(hydVar, new hyd(j4, new tnh(R.string.my_contacts), j2 == j4)));
        this.o = mjgVarA;
        this.p = new r8e(mjgVarA);
        int[] iArr = {6, 12, 24, 48};
        this.r = iArr;
        mjg mjgVarA2 = p90.a(Integer.valueOf(iArr[2]));
        this.s = mjgVarA2;
        this.t = e9i.G0(new q0d(mjgVarA2, this, 10), this.b, j0g.a, null);
        this.w = (z && v1h.c(i, 2)) ? R.id.oneme_stories_preset_whitelist_my_contacts_item : R.id.oneme_stories_preset_whitelist_all_item;
    }

    public final void B() {
        mjg mjgVar;
        Object value;
        ArrayList arrayList;
        do {
            mjgVar = this.o;
            value = mjgVar.getValue();
            List<hyd> list = (List) value;
            arrayList = new ArrayList(yw3.W0(list, 10));
            for (hyd hydVar : list) {
                if (!(hydVar instanceof hyd)) {
                    ore.o();
                    return;
                }
                long j = hydVar.a;
                boolean z = j == this.w;
                m8b m8bVar = this.u;
                int i = m8bVar != null ? m8bVar.d : 0;
                long j2 = R.id.oneme_stories_preset_whitelist_favorites_item;
                ynh tnhVar = null;
                if (j != j2 || i <= 0) {
                    if (j == j2 && i == 0 && z) {
                        tnhVar = new tnh(R.string.oneme_stories_no_contacts_selected);
                    }
                } else if (i > 0) {
                    tnhVar = new pnh(R.plurals.n_contacts, i);
                }
                arrayList.add(new hyd(j, hydVar.b, z, tnhVar, hydVar.e));
            }
        } while (!mjgVar.h(value, arrayList));
    }

    public final void C(long j) {
        m8b m8bVar;
        this.w = j;
        if (j == R.id.oneme_stories_preset_whitelist_favorites_item && ((m8bVar = this.u) == null || m8bVar.i())) {
            this.m.a(new dtc(new tnh(R.string.oneme_stories_no_contacts_selected), Integer.valueOf(R.drawable.icon_profile_squircle_fill), new tnh(R.string.oneme_stories_only_you_will_see)));
        } else {
            a8j.x(this.h, ayd.a);
        }
    }

    public final void D(long j) {
        Object next;
        List list = (List) this.p.a.getValue();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((hyd) next).a != j);
        hyd hydVar = (hyd) next;
        if (hydVar instanceof hyd) {
            C(j);
            B();
            return;
        }
        if (hydVar != null) {
            ore.o();
            return;
        }
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, zo5.g(list.size(), j, "tryToMarkItemChecked: id: ", ", no item found items size: "), null);
        }
    }
}
