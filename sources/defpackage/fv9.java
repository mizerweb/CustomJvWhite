package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import one.me.mediaeditor.editandreply.EditAndReplyScreen;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fv9 implements gv9, r89, rv9, n3a, qg4, r4a, tg4, fha, t5e, i8c, n78, qbf, s72, t65, kq4, sxe {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fv9(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.s72
    public Object Q(r72 r72Var) {
        vn7 vn7Var = (vn7) this.b;
        amc amcVar = (amc) vn7Var.b;
        if (amcVar != null) {
            r72 r72Var2 = (r72) amcVar.a;
            Objects.requireNonNull(r72Var2);
            r72Var2.c();
        }
        Object obj = this.c;
        vn7Var.b = new amc(r72Var, obj);
        return c0a.n(obj, "PendingValue ");
    }

    @Override // defpackage.qg4
    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 7:
                t4a t4aVar = (t4a) obj3;
                ryh ryhVarB = (ryh) obj2;
                j4d j4dVar = (j4d) obj;
                g98 g98Var = ryhVarB.H;
                if (!g98Var.isEmpty()) {
                    qyh qyhVarC = ryhVarB.a().c();
                    pci it = g98Var.values().iterator();
                    while (it.hasNext()) {
                        nyh nyhVar = (nyh) it.next();
                        hyh hyhVar = (hyh) t4aVar.f.h.get(nyhVar.a.b);
                        if (hyhVar == null || nyhVar.a.a != hyhVar.a) {
                            qyhVarC.a(nyhVar);
                        } else {
                            qyhVarC.a(new nyh(hyhVar, nyhVar.b));
                        }
                    }
                    ryhVarB = qyhVarC.b();
                }
                j4dVar.k(ryhVarB);
                break;
            case 8:
                i2a i2aVar = (i2a) obj2;
                d3a d3aVar = (d3a) ((t4a) obj3).c.get();
                if (d3aVar != null && !d3aVar.j()) {
                    d3aVar.g(i2aVar, false);
                    break;
                }
                break;
            case 9:
                t4a t4aVar2 = (t4a) obj3;
                Surface surface = (Surface) obj2;
                j4d j4dVar2 = (j4d) obj;
                ((d3a) t4aVar2.c.get()).getClass();
                if (surface != null) {
                    s4a s4aVar = new s4a(surface);
                    t4aVar2.h = s4aVar;
                    j4dVar2.p0(s4aVar);
                } else {
                    j4dVar2.p0(null);
                    t4aVar2.h = null;
                }
                break;
            case 10:
            case 11:
            default:
                vvk.e((f70) obj, (String) obj3, new nua(2, (cf7) obj2));
                break;
            case 12:
                ed7 ed7Var = (ed7) obj3;
                ((c5a) obj).o(ed7Var.b, (x4a) ed7Var.c, (uz9) obj2);
                break;
            case 13:
                vvk.e((f70) obj, (String) obj3, (tg4) obj2);
                break;
        }
    }

    @Override // defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        uxe uxeVar = (uxe) this.b;
        ij0 ij0Var = (ij0) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        lh0 lh0Var = uxeVar.d;
        ArrayList arrayListE = uxeVar.E(sQLiteDatabase, ij0Var, lh0Var.b);
        for (vhd vhdVar : vhd.values()) {
            if (vhdVar != ij0Var.c) {
                int size = lh0Var.b - arrayListE.size();
                if (size <= 0) {
                    break;
                }
                xtj xtjVarA = ij0.a();
                xtjVarA.D(ij0Var.a);
                if (vhdVar == null) {
                    ore.n("Null priority");
                    return null;
                }
                xtjVarA.d = vhdVar;
                xtjVarA.c = ij0Var.b;
                arrayListE.addAll(uxeVar.E(sQLiteDatabase, xtjVarA.n(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListE.size(); i++) {
            sb.append(((ii0) arrayListE.get(i)).a);
            if (i < arrayListE.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", SdkMetricStatEvent.NAME_KEY, SdkMetricStatEvent.VALUE_KEY}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new txe(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListE.listIterator();
        while (listIterator.hasNext()) {
            ii0 ii0Var = (ii0) listIterator.next();
            long j2 = ii0Var.a;
            if (map.containsKey(Long.valueOf(j2))) {
                js8 js8VarC = ii0Var.c.c();
                for (txe txeVar : (Set) map.get(Long.valueOf(j2))) {
                    js8VarC.i(txeVar.a, txeVar.b);
                }
                listIterator.set(new ii0(j2, ii0Var.b, js8VarC.j()));
            }
        }
        return arrayListE;
    }

    @Override // defpackage.n3a
    public void b(i2a i2aVar) {
        int i = this.a;
        Object obj = this.c;
        o3a o3aVar = (o3a) this.b;
        switch (i) {
            case 5:
                ((by3) obj).h(o3aVar.g.t);
                break;
            default:
                String str = ((uv9) obj).a;
                if (TextUtils.isEmpty(str)) {
                    lvb.G0("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                } else {
                    j4d j4dVar = o3aVar.g.t;
                    if (j4dVar.c(17)) {
                        ush ushVarV = j4dVar.v();
                        tsh tshVar = new tsh();
                        for (int i2 = 0; i2 < ushVarV.o(); i2++) {
                            if (TextUtils.equals(ushVarV.m(i2, tshVar, 0L).b.a, str)) {
                                j4dVar.j0(i2);
                            }
                        }
                    } else {
                        lvb.G0("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    }
                }
                break;
        }
    }

    @Override // defpackage.gv9
    public void c(e38 e38Var, int i) {
        int i2 = this.a;
        Object obj = this.c;
        jv9 jv9Var = (jv9) this.b;
        switch (i2) {
            case 0:
                List list = (List) obj;
                sv9 sv9Var = jv9Var.c;
                z88 z88VarL = c98.l();
                for (int i3 = 0; i3 < list.size(); i3++) {
                    z88VarL.c(((ry9) list.get(i3)).d(true));
                }
                e38Var.R(sv9Var, i, new m51(z88VarL.h()), true);
                break;
            default:
                e38Var.z(jv9Var.c, i, ((b0a) obj).c());
                break;
        }
    }

    @Override // defpackage.qbf
    public int e(int i) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 19:
                NotificationsSettingsScreen notificationsSettingsScreen = (NotificationsSettingsScreen) obj;
                zv8[] zv8VarArr = NotificationsSettingsScreen.m;
                nee adapter = ((k96) obj2).getAdapter();
                r84 r84Var = adapter instanceof r84 ? (r84) adapter : null;
                if (r84Var != null) {
                    Pair pairG = r84Var.G(i);
                    Integer num = pairG.first instanceof cob ? (Integer) pairG.second : -1;
                    cob cobVar = notificationsSettingsScreen.g;
                    int iL = cobVar.l();
                    int iIntValue = num.intValue();
                    if (iIntValue >= 0 && iIntValue < iL) {
                        wnb wnbVar = (wnb) ((k79) cobVar.F(num.intValue()));
                        k79 k79VarJ = cobVar.J(num.intValue() - 1);
                        wnb wnbVar2 = k79VarJ instanceof wnb ? (wnb) k79VarJ : null;
                        k79 k79VarJ2 = cobVar.J(num.intValue() + 1);
                        wnb wnbVar3 = k79VarJ2 instanceof wnb ? (wnb) k79VarJ2 : null;
                        if (wnbVar.g()) {
                            if ((wnbVar2 == null || wnbVar.A() != wnbVar2.A()) && (wnbVar3 == null || wnbVar.A() != wnbVar3.A())) {
                                return 4;
                            }
                            if (wnbVar2 == null || wnbVar.A() != wnbVar2.A() || (wnbVar.A() == wnbVar2.A() && !wnbVar2.g())) {
                                return (wnbVar3 != null && wnbVar.A() == wnbVar3.A() && wnbVar3.g()) ? 1 : 4;
                            }
                            return (wnbVar3 == null || wnbVar.A() != wnbVar3.A()) ? 3 : 2;
                        }
                    }
                }
                return 0;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
            case 21:
            default:
                ku8 ku8Var = ProfileScreen.B;
                int f = ((frd) ((k79) ((dud) ((k96) obj2).getAdapter()).F(i))).getF();
                if (((f8b) obj).d(f & 268435455)) {
                    return 0;
                }
                if ((f & 536870912) != 0) {
                    return 1;
                }
                if ((f & 1073741824) != 0) {
                    return 2;
                }
                return (f & Integer.MIN_VALUE) != 0 ? 3 : 4;
            case 22:
                int f2 = ((vnd) ((k79) ((ProfileEditAdminPermissionsWidget) obj2).g.F(i))).getF();
                if (((f8b) obj).d(f2 & 536870911)) {
                    return 0;
                }
                if ((f2 & 536870912) != 0) {
                    return 1;
                }
                if ((f2 & 1073741824) != 0) {
                    return 2;
                }
                return (f2 & Integer.MIN_VALUE) != 0 ? 3 : 4;
            case 23:
                int f3 = ((vnd) ((k79) ((ProfileEditScreen) obj2).g.F(i))).getF();
                if (((f8b) obj).d(f3 & 536870911)) {
                    return 0;
                }
                if ((f3 & 536870912) != 0) {
                    return 1;
                }
                if ((f3 & 1073741824) != 0) {
                    return 2;
                }
                return (f3 & Integer.MIN_VALUE) != 0 ? 3 : 4;
            case 24:
                int f4 = ((frd) ((k79) ((ProfileInviteScreen) obj2).e.F(i))).getF();
                if (((f8b) obj).d(f4 & 268435455)) {
                    return 0;
                }
                if ((f4 & 536870912) != 0) {
                    return 1;
                }
                if ((f4 & 1073741824) != 0) {
                    return 2;
                }
                return (f4 & Integer.MIN_VALUE) != 0 ? 3 : 4;
            case 25:
                int f5 = ((vnd) ((k79) ((ProfileMemberPermissionsScreen) obj2).d.F(i))).getF();
                if (((f8b) obj).d(f5 & 536870911)) {
                    return 0;
                }
                if ((f5 & 536870912) != 0) {
                    return 1;
                }
                if ((f5 & 1073741824) != 0) {
                    return 2;
                }
                return (f5 & Integer.MIN_VALUE) != 0 ? 3 : 4;
        }
    }

    @Override // defpackage.kq4
    public Object h(Task task) {
        xp9 xp9Var = (xp9) this.b;
        String str = (String) this.c;
        synchronized (xp9Var) {
            ((mw) xp9Var.c).remove(str);
        }
        return task;
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        ((j3d) obj).S(((c4d) ((js8) this.b).a).q(), ((Integer) this.c).intValue());
    }

    @Override // defpackage.r4a
    public Object k(d3a d3aVar, i2a i2aVar, int i) {
        int i2 = this.a;
        Object obj = this.c;
        r4a r4aVar = (r4a) this.b;
        switch (i2) {
            case 10:
                return d3aVar.j() ? rx8.J(new wmf(-100)) : vqi.o0((e89) r4aVar.k(d3aVar, i2aVar, i), new oo(d3aVar, i2aVar, (f4a) obj, 13));
            default:
                return d3aVar.j() ? rx8.J(new wmf(-100)) : vqi.o0((e89) r4aVar.k(d3aVar, i2aVar, i), new oo(d3aVar, i2aVar, (q4a) obj, 14));
        }
    }

    @Override // defpackage.rv9
    public void l(jv9 jv9Var) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 3:
                jv9Var.k0((c4d) obj2, (a4d) obj);
                break;
            default:
                fmf fmfVar = (fmf) obj2;
                h3d h3dVar = (h3d) obj;
                iu9 iu9Var = jv9Var.a;
                if (jv9Var.isConnected()) {
                    boolean zEquals = Objects.equals(jv9Var.x, h3dVar);
                    boolean zEquals2 = Objects.equals(jv9Var.w, fmfVar);
                    if (!zEquals || !zEquals2) {
                        jv9Var.w = fmfVar;
                        if (zEquals) {
                            z = false;
                        } else {
                            jv9Var.x = h3dVar;
                            h3d h3dVar2 = jv9Var.z;
                            h3d h3dVarY = jv9.Y(h3dVar, jv9Var.y);
                            jv9Var.z = h3dVarY;
                            z = !h3dVarY.equals(h3dVar2);
                        }
                        if (!zEquals2 || z) {
                            ghe gheVar = jv9Var.u;
                            ghe gheVar2 = jv9Var.v;
                            ghe gheVarN0 = jv9.n0(jv9Var.t, jv9Var.s, fmfVar, jv9Var.z, jv9Var.I);
                            jv9Var.u = gheVarN0;
                            jv9Var.v = jv9.m0(gheVarN0, jv9Var.s, jv9Var.I, fmfVar, jv9Var.z);
                            ghe gheVar3 = jv9Var.u;
                            gheVar3.getClass();
                            z2 = !j8f.a(gheVar3, gheVar);
                            ghe gheVar4 = jv9Var.v;
                            gheVar4.getClass();
                            z3 = !j8f.a(gheVar4, gheVar2);
                        } else {
                            z2 = false;
                            z3 = false;
                        }
                        if (z) {
                            jv9Var.i.f(13, new tu9(jv9Var, 11));
                        }
                        if (!zEquals2) {
                            iu9Var.getClass();
                            lvb.b0(Looper.myLooper() == iu9Var.f.getLooper());
                            iu9Var.e.s();
                        }
                        if (z3) {
                            iu9Var.getClass();
                            lvb.b0(Looper.myLooper() == iu9Var.f.getLooper());
                            iu9Var.e.getClass();
                        }
                        if (z2) {
                            iu9Var.getClass();
                            lvb.b0(Looper.myLooper() == iu9Var.f.getLooper());
                            iu9Var.e.o();
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.n78
    public void n(o78 o78Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 18:
                ((n78) obj).n((xp9) obj2);
                break;
            default:
                ((n78) obj).n((ls9) obj2);
                break;
        }
    }

    @Override // defpackage.t65
    public Object t() {
        return new EditAndReplyScreen((dy5) this.b, (ha9) this.c);
    }

    @Override // defpackage.i8c
    public void w(j8c j8cVar) {
        MessagesListWidget messagesListWidget = (MessagesListWidget) this.b;
        v3g v3gVar = (v3g) this.c;
        zv8[] zv8VarArr = MessagesListWidget.T1;
        if (j8cVar == j8c.e) {
            jsa jsaVarF1 = messagesListWidget.F1();
            long j = v3gVar.a;
            jsaVarF1.getClass();
            a8j.t(jsaVarF1, null, new asa(jsaVarF1, j, false, false, null), 3);
        }
    }
}
