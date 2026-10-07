package defpackage;

import android.telecom.CallAudioState;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import one.me.contactlist.ContactListWidget;
import one.me.members.list.MembersListWidget;
import one.me.profile.screens.joinrequests.JoinRequestsScreen;
import one.me.sdk.arch.Widget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.analytics.internal.upload.DbUploader;
import ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w14 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w14(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        String strValueOf;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        final int i = 1;
        switch (this.a) {
            case 0:
                return Integer.valueOf(((g24) this.b).f.G((qxe) obj, (qei) this.c));
            case 1:
                ((l54) this.b).b.c((qxe) obj, (ArrayList) this.c);
                return sbi.a;
            case 2:
                ee4 ee4Var = (ee4) this.b;
                l82 l82Var = (l82) this.c;
                CallAudioState callAudioState = (CallAudioState) obj;
                je9 je9Var = je9.d;
                a80 a80VarA = qwk.a(callAudioState);
                a80 a80Var = ee4Var.g;
                if (a80Var.equals(a80.d)) {
                    a80Var = null;
                }
                if (a80Var == null) {
                    a80Var = a80VarA;
                }
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    int route = callAudioState.getRoute();
                    String str = a80VarA.b;
                    int i2 = a80VarA.a;
                    String str2 = a80VarA.c;
                    String str3 = a80Var.b;
                    StringBuilder sbA = nbh.A(route, "AudioState changed: route=", ", new=", str, "(type=");
                    sbA.append(p.p(i2));
                    sbA.append(", id=");
                    sbA.append(str2);
                    sbA.append("), old=");
                    sbA.append(str3);
                    a4cVar.c(je9Var, "CallAudioController", sbA.toString(), null);
                }
                l82Var.a(a80Var, a80VarA);
                int supportedRouteMask = callAudioState.getSupportedRouteMask();
                if (supportedRouteMask != ee4Var.f) {
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, "CallAudioController", qt4.l("supportedRouteMask changed: ", ee4Var.f, supportedRouteMask, " -> "), null);
                    }
                    ee4Var.f = supportedRouteMask;
                    ee4Var.e(ee4Var.getAvailableAudioDevices());
                }
                ee4Var.g = a80VarA;
                return sbi.a;
            case 3:
                ek4 ek4Var = (ek4) this.b;
                wj4 wj4Var = (wj4) ((zsj) this.c).g;
                long jLongValue = ((Long) obj).longValue();
                if (ek4Var.k) {
                    wj4Var.K0();
                } else if (ek4Var.f != null) {
                    wj4Var.h0(jLongValue);
                } else {
                    wj4Var.t0(jLongValue);
                }
                return sbi.a;
            case 4:
                s81 s81Var = (s81) this.b;
                ek4 ek4Var2 = (ek4) this.c;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                s81Var.invoke(Long.valueOf(ek4Var2.a), bool);
                return sbi.a;
            case 5:
                ContactListWidget contactListWidget = (ContactListWidget) this.b;
                k96 k96Var = (k96) this.c;
                int iIntValue = ((Integer) obj).intValue();
                zv8[] zv8VarArr = ContactListWidget.o1;
                CharSequence charSequenceQ1 = contactListWidget.q1();
                if (charSequenceQ1 == null || charSequenceQ1.length() == 0) {
                    return null;
                }
                int iN = contactListWidget.s.n(iIntValue);
                if (iN == R.id.oneme_contactlist_contact_view_type) {
                    return k96Var.getResources().getString(R.string.search_all_contacts_header);
                }
                if (iN == R.id.oneme_contactlist_global_contact_view_type) {
                    return k96Var.getResources().getString(R.string.search_global_contacts_header);
                }
                if (iN == R.id.search_action_view_type) {
                    return k96Var.getResources().getString(R.string.search_actions_header);
                }
                return null;
            case 6:
                return Long.valueOf(((in4) this.b).b.e((qxe) obj, (xi4) this.c));
            case 7:
                ji4 ji4Var = (ji4) this.b;
                ii4 ii4Var = (ii4) this.c;
                di4 di4Var = (di4) obj;
                di4Var.k = ji4Var;
                di4Var.i = ii4Var;
                return sbi.a;
            case 8:
                ri riVar = (ri) this.b;
                rp4 rp4Var = (rp4) obj;
                vp4 vp4Var = (vp4) ((Widget) this.c);
                if (!riVar.a) {
                    riVar.a = true;
                    vp4Var.E(rp4Var.a, ((zp4) riVar.b).a);
                }
                riVar.dismiss();
                return sbi.a;
            case 9:
                r72 r72Var = (r72) this.b;
                xf5 xf5Var = (xf5) this.c;
                Throwable th = (Throwable) obj;
                if (th == null) {
                    r72Var.b(xf5Var.l());
                } else if (th instanceof CancellationException) {
                    r72Var.c();
                } else {
                    r72Var.d(th);
                }
                return sbi.a;
            case 10:
                String str4 = (String) this.b;
                p3c p3cVar = (p3c) this.c;
                vxe vxeVarO0 = ((qxe) obj).O0(str4);
                try {
                    ((yre) p3cVar.b).invoke(vxeVarO0);
                    int iN2 = qyj.n(vxeVarO0, SdkMetricStatEvent.NAME_KEY);
                    int iN3 = qyj.n(vxeVarO0, "rows");
                    int iN4 = qyj.n(vxeVarO0, "bytes");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        if (iN2 == -1) {
                            throw new IllegalStateException("Missing column 'name' for a NON-NULL value, column not found in result.");
                        }
                        String strB0 = vxeVarO0.B0(iN2);
                        long j = 0;
                        long j2 = iN3 == -1 ? 0L : vxeVarO0.getLong(iN3);
                        if (iN4 != -1) {
                            j = vxeVarO0.getLong(iN4);
                        }
                        arrayList.add(new fhh(strB0, j2, j));
                    }
                    return arrayList;
                } finally {
                    vxeVarO0.close();
                }
            case 11:
                return DbUploader.upload$lambda$0$0((DbUploader) this.b, (CallAnalyticsConfig) this.c, (Iterator) obj);
            case 12:
                sv1 sv1Var = (sv1) this.b;
                y85 y85Var = (y85) this.c;
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof ApiInvocationException) {
                    ApiInvocationException apiInvocationException = (ApiInvocationException) th2;
                    gi6 gi6VarB = qgl.b(apiInvocationException);
                    if (gi6VarB == null || (strValueOf = gi6VarB.name()) == null) {
                        strValueOf = String.valueOf(apiInvocationException.getErrorCode());
                    }
                } else {
                    strValueOf = "UNKNOWN";
                }
                String str5 = strValueOf;
                String strA = ns4.a(sv1Var.g());
                boolean zA = sv1Var.a();
                tv1 tv1VarE = sv1Var.e();
                sa2 sa2VarO = y85Var.O();
                long j3 = zA ? 2L : 1L;
                String strValueOf2 = String.valueOf(tv1VarE.a);
                sa2VarO.getClass();
                sa2.c(sa2VarO, "INCOMING_CALL_INIT", strA, strValueOf2, Long.valueOf(j3), str5, null, false, null, 464);
                y85Var.R().a = 4;
                y85Var.X(th2);
                return sbi.a;
            case 13:
                ((sh5) this.b).b.d((qxe) obj, (oh5) this.c);
                return sbi.a;
            case 14:
                fm5 fm5Var = (fm5) this.b;
                ao0 ao0Var = (ao0) this.c;
                Double d = (Double) obj;
                ru1 ru1Var = fm5Var.j;
                Collection collectionJ = ru1Var.j();
                HashMap map = new HashMap(collectionJ.size());
                Iterator it = collectionJ.iterator();
                while (it.hasNext()) {
                    map.put(((du1) it.next()).a, Float.valueOf(d.floatValue()));
                }
                map.put(ru1Var.a.a, Float.valueOf(d.floatValue()));
                kdb kdbVar = new kdb(map);
                ao0Var.b(fm5Var.e, "DirectCallTopology", "send 'virtual' NetworkStatusNotification: " + kdbVar);
                fm5Var.L.a(kdbVar);
                return sbi.a;
            case 15:
                ((db6) this.b).b.c((cb6) this.c);
                return sbi.a;
            case 16:
                hk6 hk6Var = (hk6) this.b;
                ev1 ev1Var = (ev1) this.c;
                ((Boolean) obj).getClass();
                p3c p3cVar2 = hk6Var.j;
                zv8[] zv8VarArr2 = hk6.k;
                vo8 vo8Var = (vo8) p3cVar2.m(hk6Var, zv8VarArr2[0]);
                if (vo8Var != null) {
                    vo8Var.b(null);
                }
                p3cVar2.B(hk6Var, zv8VarArr2[0], null);
                hk6Var.b().c = null;
                ((bn1) hk6Var.g.getValue()).e(ev1Var);
                try {
                    WindowManager windowManagerC = hk6Var.c();
                    if (windowManagerC != null) {
                        windowManagerC.removeView(ev1Var);
                    }
                    break;
                } catch (IllegalArgumentException e) {
                    gm0.V("FakePipController", "can't hide call local pip", e);
                }
                hk6Var.i = null;
                return sbi.a;
            case 17:
                ((dm6) this.b).b.c((qxe) obj, (ArrayList) this.c);
                return sbi.a;
            case 18:
                ((an6) this.b).b.c((qxe) obj, (ArrayList) this.c);
                return sbi.a;
            case 19:
                ((gn6) this.b).b.c((qxe) obj, (Iterable) this.c);
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((zn6) this.b).b.c((qxe) obj, (ArrayList) this.c);
                return sbi.a;
            case 21:
                String str6 = (String) this.b;
                Collection collection = (Collection) this.c;
                vxe vxeVarO1 = ((qxe) obj).O0(str6);
                try {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        vxeVarO1.B(i, (String) it2.next());
                        i++;
                    }
                    vxeVarO1.M0();
                    return sbi.a;
                } finally {
                    vxeVarO1.close();
                }
            case 22:
                ((wd8) this.b).b.c((qxe) obj, (List) this.c);
                return sbi.a;
            case 23:
                ((wd8) this.b).b.d((qxe) obj, (ge8) this.c);
                return sbi.a;
            case 24:
                c7k c7kVar = (c7k) this.b;
                rq8 rq8Var = (rq8) this.c;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                je9 je9Var2 = je9.f;
                final long j4 = rq8Var.a;
                if (zBooleanValue) {
                    JoinRequestsScreen joinRequestsScreen = (JoinRequestsScreen) c7kVar.b;
                    zv8[] zv8VarArr3 = JoinRequestsScreen.k;
                    final sr8 sr8VarQ1 = joinRequestsScreen.q1();
                    if (sr8VarQ1.k.add(Long.valueOf(j4))) {
                        a8j.t(sr8VarQ1, ((n0c) ((xhh) sr8VarQ1.f.getValue())).b(), new or8(sr8VarQ1, j4, null, 1), 2).Y(new cf7() { // from class: lr8
                            @Override // defpackage.cf7
                            public final Object invoke(Object obj2) {
                                int i3 = i;
                                sbi sbiVar = sbi.a;
                                long j5 = j4;
                                sr8 sr8Var = sr8VarQ1;
                                switch (i3) {
                                    case 0:
                                        sr8Var.k.remove(Long.valueOf(j5));
                                        break;
                                    default:
                                        sr8Var.k.remove(Long.valueOf(j5));
                                        break;
                                }
                                return sbiVar;
                            }
                        });
                    } else {
                        String name = sr8.class.getName();
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                            a4cVar3.c(je9Var2, name, nbh.s(j4, "user ", " already in processing"), null);
                        }
                    }
                } else {
                    JoinRequestsScreen joinRequestsScreen2 = (JoinRequestsScreen) c7kVar.b;
                    zv8[] zv8VarArr4 = JoinRequestsScreen.k;
                    final sr8 sr8VarQ2 = joinRequestsScreen2.q1();
                    if (sr8VarQ2.k.add(Long.valueOf(j4))) {
                        sgg sggVarT = a8j.t(sr8VarQ2, ((n0c) ((xhh) sr8VarQ2.f.getValue())).b(), new or8(sr8VarQ2, j4, null, 0), 2);
                        final int i3 = z ? 1 : 0;
                        sggVarT.Y(new cf7() { // from class: lr8
                            @Override // defpackage.cf7
                            public final Object invoke(Object obj2) {
                                int i4 = i3;
                                sbi sbiVar = sbi.a;
                                long j5 = j4;
                                sr8 sr8Var = sr8VarQ2;
                                switch (i4) {
                                    case 0:
                                        sr8Var.k.remove(Long.valueOf(j5));
                                        break;
                                    default:
                                        sr8Var.k.remove(Long.valueOf(j5));
                                        break;
                                }
                                return sbiVar;
                            }
                        });
                    } else {
                        String name2 = sr8.class.getName();
                        a4c a4cVar4 = gm0.f;
                        if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                            a4cVar4.c(je9Var2, name2, nbh.s(j4, "user ", " already in processing"), null);
                        }
                    }
                }
                return sbi.a;
            case 25:
                return MLFeaturesManagerImpl.setNsParams$lambda$1((k36) this.b, (String) this.c, (uhb) obj);
            case 26:
                aw8 aw8Var = (aw8) this.b;
                aw8 aw8Var2 = (aw8) this.c;
                tr3 tr3Var = (tr3) obj;
                tr3.a(tr3Var, "key", aw8Var.d());
                tr3.a(tr3Var, SdkMetricStatEvent.VALUE_KEY, aw8Var2.d());
                return sbi.a;
            case 27:
                ((ys9) this.b).b.d((qxe) obj, (zs9) this.c);
                return sbi.a;
            case 28:
                l8a l8aVar = (l8a) this.b;
                MembersListWidget membersListWidget = (MembersListWidget) ((h47) this.c).g;
                ((Long) obj).getClass();
                boolean z2 = l8aVar.j;
                long j5 = l8aVar.a;
                if (!z2) {
                    a8j.x(membersListWidget.q1().f, h9a.a);
                } else if (l8aVar.h) {
                    a8j.x(membersListWidget.q1().f, l9a.a);
                } else if (l8aVar.i) {
                    a8j.x(membersListWidget.q1().f, new k9a(j5));
                } else {
                    membersListWidget.q1().E(j5, l8aVar.k);
                }
                return sbi.a;
            default:
                lh9 lh9Var = (lh9) this.b;
                MembersListWidget membersListWidget2 = (MembersListWidget) this.c;
                Integer num = (Integer) obj;
                num.getClass();
                zv8[] zv8VarArr5 = MembersListWidget.t;
                l8a l8aVar2 = (l8a) lh9Var.invoke(num);
                if (l8aVar2 != null) {
                    n9a n9aVarQ1 = membersListWidget2.q1();
                    long j6 = l8aVar2.a;
                    Set set = (Set) n9aVarQ1.h.getValue();
                    if (set != null && set.contains(Long.valueOf(j6)) && l8aVar2.k) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
