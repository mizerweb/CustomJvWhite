package defpackage;

import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.stories.viewer.viewer.UserStoriesScreen;
import one.video.upload.exceptions.InputFileCorruptException;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bad implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bad(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        s8 s8Var;
        ye6 ye6Var;
        gj2 gj2Var;
        boolean zY = true;
        bae baeVar = null;
        Integer numValueOf = null;
        switch (this.a) {
            case 0:
                ((cad) this.b).u.invoke(Long.valueOf(((n7d) this.c).c), (String) obj);
                return sbi.a;
            case 1:
                o0e o0eVar = (o0e) this.b;
                if (((vo8) o0eVar.h.m(o0eVar, o0e.p[0])) == ((sgg) this.c)) {
                    mjg mjgVar = o0eVar.i;
                    Boolean bool = Boolean.FALSE;
                    mjgVar.getClass();
                    mjgVar.j(null, bool);
                }
                return sbi.a;
            case 2:
                mae maeVar = (mae) this.b;
                String str = (String) this.c;
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM recent WHERE recent_type=? AND emoji=?");
                try {
                    vxeVarO0.c(1, maeVar.a);
                    vxeVarO0.B(2, str);
                    int iE = qyj.E(vxeVarO0, "id");
                    int iE2 = qyj.E(vxeVarO0, "recent_type");
                    int iE3 = qyj.E(vxeVarO0, "recent_time");
                    int iE4 = qyj.E(vxeVarO0, "server_id");
                    int iE5 = qyj.E(vxeVarO0, "sticker_id");
                    int iE6 = qyj.E(vxeVarO0, "emoji");
                    int iE7 = qyj.E(vxeVarO0, "gif");
                    int iE8 = qyj.E(vxeVarO0, "gif_id");
                    if (vxeVarO0.M0()) {
                        if (vxeVarO0.isNull(iE5)) {
                            s8Var = null;
                        } else {
                            s8Var = new s8();
                            s8Var.a = vxeVarO0.getLong(iE5);
                        }
                        if (vxeVarO0.isNull(iE6)) {
                            ye6Var = null;
                        } else {
                            ye6Var = new ye6();
                            ye6Var.a = vxeVarO0.B0(iE6);
                        }
                        if (vxeVarO0.isNull(iE7) && vxeVarO0.isNull(iE8)) {
                            gj2Var = null;
                        } else {
                            gj2Var = new gj2(5);
                            gj2Var.c = vxeVarO0.getBlob(iE7);
                            gj2Var.b = vxeVarO0.getLong(iE8);
                        }
                        bae baeVar2 = new bae();
                        baeVar2.a = vxeVarO0.getLong(iE);
                        if (!vxeVarO0.isNull(iE2)) {
                            numValueOf = Integer.valueOf((int) vxeVarO0.getLong(iE2));
                        }
                        baeVar2.b = mnl.c(numValueOf);
                        baeVar2.c = vxeVarO0.getLong(iE3);
                        baeVar2.d = vxeVarO0.getLong(iE4);
                        baeVar2.e = s8Var;
                        baeVar2.f = ye6Var;
                        baeVar2.g = gj2Var;
                        baeVar = baeVar2;
                    }
                    return baeVar;
                } finally {
                    vxeVarO0.close();
                }
            case 3:
                ((aae) this.b).b.d((qxe) obj, (bae) this.c);
                return sbi.a;
            case 4:
                return Long.valueOf(((bre) this.b).b.e((qxe) obj, (rqe) this.c));
            case 5:
                ((d8f) this.b).g.s1((nn7) this.c);
                return sbi.a;
            case 6:
                i9f i9fVar = (i9f) this.b;
                f9f f9fVar = (f9f) this.c;
                xcd xcdVarK = i9fVar.b().k((String) obj);
                List listA = i9fVar.c().a(xcdVarK.a.toString(), f9fVar.c);
                j7c j7cVarC = i9fVar.c();
                kbc kbcVarM = pq3.j.e(i9fVar.a).m();
                j7cVarC.getClass();
                return new xcd(j7c.e(kbcVarM, xcdVarK, listA), xcdVarK.b);
            case 7:
                String str2 = (String) this.b;
                g61 g61Var = (g61) this.c;
                vvk.b((jg8) obj, str2, g61Var.a, g61Var.b, true);
                return sbi.a;
            case 8:
                ((ttf) this.b).f.a(((Float) obj).floatValue(), ((k79) this.c).getItemId());
                return sbi.a;
            case 9:
                SettingsPrivacyScreen settingsPrivacyScreen = (SettingsPrivacyScreen) this.b;
                RecyclerView recyclerView = (RecyclerView) this.c;
                cf7 cf7VarP = ((waf) ((k79) settingsPrivacyScreen.h.F(((Integer) obj).intValue()))).p();
                return Integer.valueOf(cf7VarP != null ? ((Number) cf7VarP.invoke(pq3.j.h(recyclerView))).intValue() : Integer.MIN_VALUE);
            case 10:
                gbg gbgVar = (gbg) this.b;
                rt2 rt2Var = (rt2) this.c;
                vg4 vg4Var = (vg4) obj;
                int iOrdinal = gbgVar.b.ordinal();
                if (iOrdinal != 0 && iOrdinal == 1) {
                    zY = rt2Var.Y(vg4Var.v());
                }
                return Boolean.valueOf(zY);
            case 11:
                List list = (List) this.b;
                ejg ejgVar = (ejg) this.c;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((i64) it.next()).j0(th);
                    }
                } else {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((i64) it2.next()).Q(sbi.a);
                    }
                }
                synchronized (ejgVar.d) {
                    ejgVar.f.removeAll(list);
                }
                return sbi.a;
            case 12:
                return Long.valueOf(((qwg) this.b).g.e((qxe) obj, (xwg) this.c));
            case 13:
                return Long.valueOf(((qwg) this.b).d.e((qxe) obj, (ixg) this.c));
            case 14:
                return Long.valueOf(((qwg) this.b).b.e((qxe) obj, (swg) this.c));
            case 15:
                return Long.valueOf(((qwg) this.b).c.e((qxe) obj, (lxg) this.c));
            case 16:
                return ((yzg) this.b).b.f((qxe) obj, (ArrayList) this.c);
            case 17:
                HashMap map = (HashMap) this.b;
                nf2 nf2Var = (nf2) this.c;
                cli cliVar = (cli) obj;
                Object obj2 = map.get(cliVar);
                if (obj2 != null) {
                    ii2 ii2Var = (ii2) obj2;
                    return cliVar.r(nf2Var, ii2Var.a, ii2Var.b);
                }
                ore.p("Required value was null.");
                return null;
            case 18:
                c9h c9hVar = (c9h) this.b;
                String str3 = (String) this.c;
                pj4 pj4Var = ((o63) obj).a;
                String strB = xoh.b(pj4Var.l);
                ArrayList arrayList = new ArrayList();
                c9h.d(arrayList, pj4Var.e);
                return ((cmf) c9hVar.c).k(pj4Var.a, arrayList, strB, str3, pj4Var.d(us0.c));
            case 19:
                pdh pdhVar = (pdh) this.b;
                vo8 vo8Var = (vo8) this.c;
                Throwable th2 = (Throwable) obj;
                String str4 = pdhVar.b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str4, "try remove job " + vo8Var.hashCode() + " on completion: cause=" + th2, null);
                    }
                }
                pdh.c.compute(Long.valueOf(pdhVar.getId()), new mw1(18, new uv2(vo8Var, 12, pdhVar)));
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return Long.valueOf(((xkh) this.b).b.e((qxe) obj, (ujh) this.c));
            case 21:
                noh nohVar = (noh) this.b;
                knh knhVar = (knh) this.c;
                TextPaint textPaint = new TextPaint();
                nohVar.a(knhVar.a, textPaint, knhVar.b.getResources().getDisplayMetrics(), (bx5) knhVar.c.a.getValue());
                return textPaint;
            case 22:
                vvk.f((c60) obj, (u60) this.b, ((s7f) ((et3) ((ifi) this.c).c.getValue())).f());
                return sbi.a;
            case 23:
                ehi.b.remove((String) this.b, (sgg) this.c);
                return sbi.a;
            case 24:
                euc eucVar = (euc) this.b;
                dki dkiVar = (dki) this.c;
                lr6 lr6Var = (lr6) obj;
                ((ze9) eucVar.b).b("Uploader", new vbi(3, lr6Var));
                long j = lr6Var.a;
                lr6 lr6Var2 = dkiVar.h;
                long j2 = lr6Var2.a;
                if (j < j2) {
                    StringBuilder sbS = qt4.s(j, "New file size ", " is less than previous one ");
                    sbS.append(j2);
                    throw new InputFileCorruptException(sbS.toString());
                }
                boolean z = lr6Var.b;
                if (!z && lr6Var2.b) {
                    throw new InputFileCorruptException("If file was marked complete it must not be set uncomplete");
                }
                if (lr6Var2.b && j != j2) {
                    StringBuilder sbS2 = qt4.s(j2, "File size must not be changed if file is complete. Current: ", ", new: ");
                    sbS2.append(j);
                    throw new InputFileCorruptException(sbS2.toString());
                }
                lr6Var2.a = j;
                lr6Var2.b = z;
                for (wdf wdfVar : eucVar.r()) {
                    agi agiVar = wdfVar instanceof agi ? (agi) wdfVar : null;
                    if (agiVar != null && agiVar.v == 1 && !agiVar.t) {
                        agiVar.d.b(HTTP.CONN_DIRECTIVE, new zn3(17));
                        SelectionKey selectionKeyKeyFor = ((SocketChannel) agiVar.e.a).keyFor((Selector) agiVar.a.c);
                        if (selectionKeyKeyFor != null) {
                            selectionKeyKeyFor.interestOps(selectionKeyKeyFor.interestOps() | 4);
                        }
                    }
                }
                return sbi.a;
            case 25:
                ((nki) this.b).b.d((qxe) obj, (chi) this.c);
                return sbi.a;
            case 26:
                kmi kmiVar = (kmi) this.b;
                up8 up8Var = (up8) this.c;
                synchronized (kmiVar.l) {
                    kmiVar.x.remove(up8Var);
                }
                return sbi.a;
            case 27:
                UserStoriesScreen userStoriesScreen = (UserStoriesScreen) this.b;
                v1h v1hVar = (v1h) this.c;
                zv8[] zv8VarArr = UserStoriesScreen.x1;
                int i = v1hVar.a;
                lsg lsgVar = (lsg) userStoriesScreen.H1().F.a.getValue();
                if (lsgVar != null) {
                    long jC = lsgVar.c();
                    userStoriesScreen.H1().K(5);
                    o65.c(uug.b.b(), zo5.g(i, jC, ":stories/edit-privacy?story_id=", "&settings="), null, null, 6);
                } else {
                    String str5 = userStoriesScreen.a;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.f;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str5, "showEditVisibility: no current story", null);
                        }
                    }
                }
                return sbi.a;
            case 28:
                ((evi) this.b).b.d((qxe) obj, (yui) this.c);
                return sbi.a;
            default:
                ((f0j) this.b).b.d((qxe) obj, (g0j) this.c);
                return sbi.a;
        }
    }
}
