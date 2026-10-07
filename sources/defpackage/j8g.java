package defpackage;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import one.me.calls.ui.bottomsheet.unkowncontact.UnknownContactBottomSheet;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class j8g extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8g(lq4 lq4Var, Object obj, Object obj2, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList] */
    private final Object l(Object obj) {
        ?? T1;
        int i;
        int size;
        Object isgVar;
        Uri uri;
        Object obj2;
        pza pzaVar;
        Uri uri2;
        int i2;
        pza pzaVar2;
        je9 je9Var = je9.e;
        je9 je9Var2 = je9.f;
        ch3.d0(obj);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        l8b l8bVar = (l8b) ((gpi) this.f).E.a.getValue();
        Long l = ((gpi) this.f).d;
        upc upcVar = (upc) this.g;
        if (l != null) {
            List listT1 = ww3.T1(upcVar.b.values());
            gpi gpiVar = (gpi) this.f;
            T1 = new ArrayList();
            for (Object obj3 : listT1) {
                long j = ((hyg) obj3).a;
                Long l2 = gpiVar.d;
                if (l2 != null && j == l2.longValue()) {
                    T1.add(obj3);
                }
            }
        } else {
            T1 = ww3.T1(upcVar.b.values());
        }
        gpi gpiVar2 = (gpi) this.f;
        ArrayList arrayList3 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        for (hyg hygVar : (Iterable) T1) {
            v1h v1hVar = (v1h) l8bVar.f(hygVar.a);
            hyg hygVarA = hyg.a(hygVar, v1hVar != null ? v1hVar.a : hygVar.c, null, i3, 4091);
            if (((Boolean) ((e5d) ((op3) gpiVar2.x.getValue()).a.getValue()).L4.a(e5d.S6[299]).i()).booleanValue() || hygVarA.l > 1) {
                je9Var = je9Var;
                l8bVar = l8bVar;
                isgVar = new isg(hygVarA.a, i4, hygVarA.d, hygVarA.e, hygVarA.c, gpi.Q(hygVarA.k), hygVarA.j, -1);
                i4++;
            } else {
                l40 l40Var = hygVarA.f;
                if (l40Var instanceof eti) {
                    eti etiVar = (eti) l40Var;
                    Uri uri3 = Uri.parse(etiVar.t);
                    String str = etiVar.h;
                    Uri uri4 = str != null ? Uri.parse(str) : null;
                    try {
                        byte[] bArr = etiVar.o;
                        uri2 = bArr != null ? Uri.parse(lrh.a(bArr)) : null;
                    } catch (Throwable th) {
                        String str2 = gpiVar2.p;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var2)) {
                            a4cVar.c(je9Var2, str2, "Error encoding thumbhash bytes to base64 uri", th);
                        }
                        uri2 = null;
                    }
                    boolean z = uri2 == null && uri4 != null;
                    if (z) {
                        String str3 = gpiVar2.p;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            pzaVar2 = null;
                            a4cVar2.c(je9Var, str3, zo5.j(hygVarA.a, "getItemFromVideo useFallbackBlur for story="), null);
                        } else {
                            pzaVar2 = null;
                        }
                        rq9 rq9Var = (rq9) gpiVar2.q.getValue();
                        rq9Var.getClass();
                        vd7.A().d(rq9Var.a(uri4), pzaVar2);
                    } else {
                        i4 = i4;
                    }
                    Long l3 = etiVar.f;
                    if (l3 != null) {
                        long jLongValue = l3.longValue();
                        u84 u84Var = new u84(jLongValue, etiVar.t, etiVar.i.intValue(), etiVar.j.intValue());
                        pui puiVar = new pui(uri4 == null ? uri2 == null ? uri3 : uri2 : uri4, uri2, 0.0f, etiVar.i.intValue(), etiVar.j.intValue());
                        long j2 = hygVarA.a;
                        int size2 = arrayList.size();
                        int iQ = gpi.Q(hygVarA.k);
                        long j3 = hygVarA.d;
                        int i5 = hygVarA.e;
                        int i6 = hygVarA.c;
                        long j4 = gpiVar2.x1;
                        Long l4 = hygVarA.j;
                        u8b u8bVar = hygVarA.i;
                        if (gpiVar2.F()) {
                            u8bVar = tyg.a;
                        } else {
                            u8b u8bVar2 = tyg.a;
                        }
                        i2 = i4;
                        jsg jsgVar = new jsg(j2, i2, size2, j3, i5, i6, iQ, l4, j4, jLongValue, uri3, puiVar, z, u8bVar);
                        arrayList.add(u84Var);
                        gpiVar2.x1 += jLongValue;
                        isgVar = jsgVar;
                    } else {
                        i2 = i4;
                        isgVar = null;
                    }
                    i4 = i2 + 1;
                    je9Var = je9Var;
                } else {
                    l8bVar = l8bVar;
                    if (l40Var instanceof puc) {
                        puc pucVar = (puc) l40Var;
                        Uri uriK = sb8.K(pucVar.d);
                        if (uriK == null) {
                            obj2 = null;
                            isgVar = null;
                        } else {
                            try {
                                byte[] bArr2 = pucVar.j;
                                uri = bArr2 != null ? Uri.parse(lrh.a(bArr2)) : null;
                            } catch (Throwable th2) {
                                String str4 = gpiVar2.p;
                                a4c a4cVar3 = gm0.f;
                                if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                                    a4cVar3.c(je9Var2, str4, "Error encoding thumbhash bytes to base64 uri", th2);
                                }
                            }
                            boolean z2 = uri == null;
                            if (z2) {
                                String str5 = gpiVar2.p;
                                a4c a4cVar4 = gm0.f;
                                if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                                    pzaVar = null;
                                    a4cVar4.c(je9Var, str5, zo5.j(hygVarA.a, "getItemFromPhoto useFallbackBlur for story="), null);
                                } else {
                                    pzaVar = null;
                                }
                                rq9 rq9Var2 = (rq9) gpiVar2.q.getValue();
                                rq9Var2.getClass();
                                vd7.A().d(rq9Var2.a(uriK), pzaVar);
                            } else {
                                i4 = i4;
                                ((h4c) ((c2a) gpiVar2.r.getValue())).e(pucVar.d, true);
                            }
                            long j5 = hygVarA.a;
                            int size3 = arrayList2.size();
                            b68 b68Var = new b68(uriK, false, uri, 56);
                            int iQ2 = gpi.Q(hygVarA.k);
                            long j6 = hygVarA.d;
                            int i7 = hygVarA.e;
                            int i8 = hygVarA.c;
                            Long l5 = hygVarA.j;
                            u8b u8bVar3 = hygVarA.i;
                            if (gpiVar2.F()) {
                                u8bVar3 = tyg.a;
                            } else {
                                u8b u8bVar4 = tyg.a;
                            }
                            i4 = i4;
                            obj2 = null;
                            isgVar = new hsg(j5, i4, size3, j6, i7, i8, iQ2, l5, b68Var, z2, u8bVar3);
                        }
                        if (isgVar == null) {
                            isgVar = obj2;
                        } else {
                            arrayList2.add(isgVar);
                            i4++;
                        }
                    } else {
                        je9Var = je9Var;
                        isgVar = null;
                    }
                }
            }
            if (isgVar != null) {
                arrayList3.add(isgVar);
            }
            je9Var2 = je9Var2;
            je9Var = je9Var;
            l8bVar = l8bVar;
            i3 = 0;
        }
        ozg ozgVar = (ozg) ((Map) ((gpi) this.f).j.j.a.getValue()).get(new Long(((gpi) this.f).c.a()));
        if (((gpi) this.f).d != null) {
            i = 1;
        } else {
            if (!arrayList3.isEmpty()) {
                size = arrayList3.size();
            } else if (ozgVar != null) {
                size = ozgVar.c;
            } else {
                i = 0;
            }
            i = size;
        }
        return new wsg(arrayList3, arrayList, arrayList2, i, (((gpi) this.f).d == null && ozgVar != null) ? ozgVar.d : (short) 0);
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                j8g j8gVar = new j8g((k8g) obj2, lq4Var, 0);
                j8gVar.f = obj;
                return j8gVar;
            case 1:
                j8g j8gVar2 = new j8g((l8g) obj2, lq4Var, 1);
                j8gVar2.f = obj;
                return j8gVar2;
            case 2:
                j8g j8gVar3 = new j8g((fjg) obj2, lq4Var, 2);
                j8gVar3.f = obj;
                return j8gVar3;
            case 3:
                j8g j8gVar4 = new j8g((gag) obj2, lq4Var, 3);
                j8gVar4.f = obj;
                return j8gVar4;
            case 4:
                j8g j8gVar5 = new j8g((hag) obj2, lq4Var, 4);
                j8gVar5.f = obj;
                return j8gVar5;
            case 5:
                return new j8g(lq4Var, (Set) this.f, (ejg) obj2, 5);
            case 6:
                return new j8g(lq4Var, (ejg) this.f, (vfe) obj2, 6);
            case 7:
                j8g j8gVar6 = new j8g(lq4Var, (rcc) obj2, 7);
                j8gVar6.f = obj;
                return j8gVar6;
            case 8:
                j8g j8gVar7 = new j8g(lq4Var, (StickerSetBottomSheet) obj2, 8);
                j8gVar7.f = obj;
                return j8gVar7;
            case 9:
                j8g j8gVar8 = new j8g((vng) obj2, lq4Var, 9);
                j8gVar8.f = obj;
                return j8gVar8;
            case 10:
                j8g j8gVar9 = new j8g((zog) obj2, lq4Var, 10);
                j8gVar9.f = obj;
                return j8gVar9;
            case 11:
                j8g j8gVar10 = new j8g((tpg) obj2, lq4Var, 11);
                j8gVar10.f = obj;
                return j8gVar10;
            case 12:
                j8g j8gVar11 = new j8g((x9h) obj2, lq4Var, 12);
                j8gVar11.f = obj;
                return j8gVar11;
            case 13:
                j8g j8gVar12 = new j8g(lq4Var, (SuggestionsWidget) obj2, 13);
                j8gVar12.f = obj;
                return j8gVar12;
            case 14:
                return new j8g((mnh) this.f, (ifh) obj2, lq4Var, 14);
            case 15:
                j8g j8gVar13 = new j8g(lq4Var, (ThreadsStateViewerScreen) obj2, 15);
                j8gVar13.f = obj;
                return j8gVar13;
            case 16:
                return new j8g((x3i) this.f, (te8) obj2, lq4Var, 16);
            case 17:
                return new j8g((j6i) this.f, (String) obj2, lq4Var, 17);
            case 18:
                j8g j8gVar14 = new j8g(lq4Var, (b9i) obj2, 18);
                j8gVar14.f = obj;
                return j8gVar14;
            case 19:
                j8g j8gVar15 = new j8g(lq4Var, (UnknownContactBottomSheet) obj2, 19);
                j8gVar15.f = obj;
                return j8gVar15;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                j8g j8gVar16 = new j8g((v05) obj2, lq4Var, 20);
                j8gVar16.f = obj;
                return j8gVar16;
            case 21:
                j8g j8gVar17 = new j8g((zgi) obj2, lq4Var, 21);
                j8gVar17.f = obj;
                return j8gVar17;
            case 22:
                j8g j8gVar18 = new j8g((cii) obj2, lq4Var, 22);
                j8gVar18.f = obj;
                return j8gVar18;
            case 23:
                return new j8g((nmf) this.f, (DeferrableSurface$SurfaceClosedException) obj2, lq4Var, 23);
            case 24:
                return new j8g((gpi) this.f, (upc) obj2, lq4Var, 24);
            case 25:
                j8g j8gVar19 = new j8g((pti) obj2, lq4Var, 25);
                j8gVar19.f = obj;
                return j8gVar19;
            case 26:
                return new j8g((Float) this.f, (hyi) obj2, lq4Var, 26);
            case 27:
                j8g j8gVar20 = new j8g((izi) obj2, lq4Var, 27);
                j8gVar20.f = obj;
                return j8gVar20;
            case 28:
                return new j8g((g1j) this.f, (byte[]) obj2, lq4Var, 28);
            default:
                j8g j8gVar21 = new j8g((TextView) obj2, lq4Var, 29);
                j8gVar21.f = obj;
                return j8gVar21;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((j8g) create((h50) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((j8g) create((h50) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                return ((j8g) create((fjg) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                ((j8g) create((h50) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                ((j8g) create((h50) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                ((j8g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                ((j8g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                ((j8g) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                ((j8g) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                ((j8g) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                ((j8g) create((e5i) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 11:
                ((j8g) create((hpg) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 12:
                ((j8g) create((String) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 13:
                ((j8g) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 14:
                ((j8g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 15:
                ((j8g) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 16:
                ((j8g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 17:
                ((j8g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 18:
                ((j8g) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 19:
                ((j8g) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((j8g) create((ylc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 21:
                ((j8g) create((vfi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 22:
                return ((j8g) create((vii) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                ((j8g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 24:
                return ((j8g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                ((j8g) create((l4d) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 26:
                ((j8g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 27:
                ((j8g) create((h50) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 28:
                ((j8g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                ((j8g) create((kbc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:262:0x0610  */
    /* JADX WARN: Code duplicated, block: B:456:0x0a3a  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        ejg ejgVar;
        boolean z;
        hl2 hl2Var;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        Integer num;
        Integer num2;
        int i3;
        Object obj2;
        int i4;
        List listT1;
        z3g z3gVar;
        List listM1;
        List list;
        List list2;
        a4g a4gVar;
        long j;
        omg omgVar;
        Object obj3;
        int i5;
        emg emgVar;
        List list3;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        nx2 nx2Var;
        lti ltiVar;
        Object value5;
        int iIntValue2 = 3;
        switch (this.e) {
            case 0:
                h50 h50Var = (h50) this.f;
                ch3.d0(obj);
                k8g.r((k8g) this.g, h50Var);
                return sbi.a;
            case 1:
                h50 h50Var2 = (h50) this.f;
                ch3.d0(obj);
                l8g.N((l8g) this.g, h50Var2);
                return sbi.a;
            case 2:
                ch3.d0(obj);
                fjg fjgVar = (fjg) this.f;
                fjg fjgVar2 = (fjg) this.g;
                return Boolean.valueOf(((fjgVar2 instanceof e25) || (fjgVar2 instanceof ru6) || fjgVar != fjgVar2) ? false : true);
            case 3:
                h50 h50Var3 = (h50) this.f;
                ch3.d0(obj);
                gag.r((gag) this.g, h50Var3);
                return sbi.a;
            case 4:
                h50 h50Var4 = (h50) this.f;
                ch3.d0(obj);
                hag.N((hag) this.g, h50Var4);
                return sbi.a;
            case 5:
                ch3.d0(obj);
                if (!((Set) this.f).isEmpty()) {
                    nmf nmfVar = new nmf((Set) this.f, true);
                    lmf lmfVar = ((kmf) nmfVar.e.getValue()).c() ? (lmf) nmfVar.f.getValue() : null;
                    if (lmfVar == null || (hl2Var = lmfVar.g) == null) {
                        iIntValue = 1;
                    } else {
                        int i6 = hl2Var.c;
                        Integer numValueOf = i6 != -1 ? Integer.valueOf(i6) : null;
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            iIntValue = 1;
                        }
                    }
                    synchronized (((ejg) this.g).d) {
                        ejgVar = (ejg) this.g;
                        if (ejgVar.i != iIntValue) {
                            ejgVar.i = iIntValue;
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        ejgVar.f();
                    }
                }
                return sbi.a;
            case 6:
                ch3.d0(obj);
                ejg ejgVar2 = (ejg) this.f;
                long j2 = ((vfe) this.g).a;
                kli kliVar = ejgVar2.e;
                if (kliVar == null) {
                    ejgVar2.c(new CameraControl$OperationCanceledException("Camera is not active."));
                } else {
                    synchronized (ejgVar2.d) {
                        z2 = j2 == ejgVar2.g;
                    }
                    if (z2) {
                        synchronized (ejgVar2.d) {
                            i = ejgVar2.h;
                            i2 = ejgVar2.i;
                            z3 = ejgVar2.j;
                            num = ejgVar2.k;
                            num2 = ejgVar2.l;
                        }
                        int iD = ejgVar2.d(i, num, z3);
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        } else if (i2 == 1 || i2 != 3) {
                            iIntValue2 = 4;
                        }
                        ylc ylcVar = new ylc(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(kjl.b(ejgVar2.a.b, iD)));
                        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
                        bg2 bg2Var = ejgVar2.a.b;
                        if (kjl.a(bg2Var).contains(Integer.valueOf(iIntValue2))) {
                            i3 = iIntValue2;
                        } else if (kjl.a(bg2Var).contains(4)) {
                            i3 = 4;
                        } else {
                            i3 = kjl.a(bg2Var).contains(1) ? 1 : 0;
                        }
                        ylc ylcVar2 = new ylc(key, Integer.valueOf(i3));
                        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
                        bg2 bg2Var2 = ejgVar2.a.b;
                        CameraCharacteristics.Key key3 = CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES;
                        qb2 qb2Var = (qb2) bg2Var2;
                        Object objC = qb2Var.c(key3);
                        Object obj4 = {0};
                        if (objC != null) {
                            obj4 = objC;
                        }
                        if (a.L0(1, (int[]) obj4)) {
                            i4 = 1;
                        } else {
                            int[] iArr = {0};
                            Object objC2 = qb2Var.c(key3);
                            if (objC2 != null) {
                                obj2 = iArr;
                                obj2 = objC2;
                            }
                            obj2 = iArr;
                            i4 = a.L0(1, (int[]) obj2) ? 1 : 0;
                        }
                        try {
                            tt4 tt4VarK = kliVar.k(wm9.Q0(ylcVar, ylcVar2, new ylc(key2, Integer.valueOf(i4))), jli.b, ili.b);
                            synchronized (ejgVar2.d) {
                                listT1 = ww3.T1(ejgVar2.f);
                            }
                            ((up8) tt4VarK).Y(new bad(listT1, 11, ejgVar2));
                        } catch (Exception e) {
                            ejgVar2.c(e);
                        }
                    }
                }
                return sbi.a;
            case 7:
                Object obj5 = this.f;
                ch3.d0(obj);
                ((rcc) this.g).setTitle((CharSequence) obj5);
                return sbi.a;
            case 8:
                Object obj6 = this.f;
                ch3.d0(obj);
                omg omgVar2 = (omg) obj6;
                StickerSetBottomSheet stickerSetBottomSheet = (StickerSetBottomSheet) this.g;
                if (omgVar2 == null) {
                    zv8[] zv8VarArr = StickerSetBottomSheet.v;
                } else {
                    List list4 = omgVar2.e;
                    j8e j8eVar = stickerSetBottomSheet.u;
                    zv8[] zv8VarArr2 = StickerSetBottomSheet.v;
                    ((r6c) j8eVar.m(stickerSetBottomSheet, zv8VarArr2[4])).setVisibility(8);
                    int size = list4.size();
                    String str = String.format(stickerSetBottomSheet.getContext().getResources().getQuantityString(R.plurals.oneme_stickers_set_count, size), Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                    int i7 = omgVar2.f;
                    int i8 = i7 == 2 ? R.string.oneme_stickers_set_remove_button : R.string.oneme_stickers_set_add_button;
                    zxb zxbVar = i7 == 2 ? zxb.SECONDARY : zxb.PRIMARY;
                    aog aogVar = (aog) stickerSetBottomSheet.q.m(stickerSetBottomSheet, zv8VarArr2[2]);
                    CharSequence charSequenceB = omgVar2.b.b(stickerSetBottomSheet.getContext());
                    if (charSequenceB == null) {
                        charSequenceB = "";
                    }
                    aogVar.a(charSequenceB, str, i8, zxbVar, true);
                    stickerSetBottomSheet.s.H(list4);
                }
                return sbi.a;
            case 9:
                List list5 = (List) this.f;
                ch3.d0(obj);
                vng vngVar = (vng) this.g;
                List list6 = (List) vngVar.l.updateAndGet(new pa1(list5, 6, vngVar));
                String str2 = ((sng) vngVar.m.get()).a;
                if (str2 == null || str2.length() == 0) {
                    mjg mjgVar = vngVar.h;
                    p9f p9fVar = new p9f(2, list6);
                    mjgVar.getClass();
                    mjgVar.j(null, p9fVar);
                }
                return sbi.a;
            case 10:
                e5i e5iVar = (e5i) this.f;
                ch3.d0(obj);
                List list7 = (List) e5iVar.a;
                gog gogVar = (gog) e5iVar.b;
                List list8 = (List) e5iVar.c;
                zog zogVar = (zog) this.g;
                String name = zog.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        int size2 = list7.size();
                        gogVar.getClass();
                        a4cVar.c(je9Var, name, "Showcase content. Sets size from sections:" + size2 + ", search in initial:" + (gogVar == hog.k), null);
                    }
                }
                gogVar.getClass();
                if (gogVar == hog.k) {
                    mjg mjgVar2 = zogVar.n;
                    List list9 = ((z3g) mjgVar2.getValue()).b;
                    ArrayList arrayListC = zogVar.C(list7, list8);
                    if (((z3g) mjgVar2.getValue()).a == 2 && !list9.isEmpty()) {
                        HashMap map = new HashMap();
                        for (Object obj7 : arrayListC) {
                            map.put(Long.valueOf(((omg) obj7).a), obj7);
                        }
                        ArrayList arrayList = new ArrayList(arrayListC.size());
                        Iterator it = list9.iterator();
                        while (it.hasNext()) {
                            omg omgVar3 = (omg) map.remove(Long.valueOf(((omg) it.next()).a));
                            if (omgVar3 != null) {
                                arrayList.add(omgVar3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj8 : arrayListC) {
                            if (map.containsKey(Long.valueOf(((omg) obj8).a))) {
                                arrayList2.add(obj8);
                            }
                        }
                        cx3.Z0(arrayList2, arrayList);
                        listM1 = arrayList;
                    } else if (zogVar.q) {
                        listM1 = zogVar.C(list7, list8);
                    } else {
                        zogVar.q = true;
                        listM1 = ww3.M1(arrayListC, new xa8(29));
                    }
                    z3gVar = listM1.isEmpty() ? z3g.c : new z3g(2, listM1);
                } else if (gogVar.b) {
                    z3g z3gVar2 = (z3g) zogVar.n.getValue();
                    List list10 = z3gVar2.b;
                    z3gVar2.getClass();
                    z3gVar = new z3g(1, list10);
                } else {
                    List listC = r66.a;
                    List list11 = gogVar.a;
                    iIntValue2 = (list11 == null || list11.isEmpty()) ? 4 : 3;
                    if (iIntValue2 != 4) {
                        List list12 = gogVar.a;
                        if (list12 != null) {
                            listC = list12;
                        }
                        listC = zogVar.C(listC, list8);
                    }
                    z3gVar = new z3g(iIntValue2, listC);
                }
                mjg mjgVar3 = zogVar.n;
                mjgVar3.getClass();
                mjgVar3.j(null, z3gVar);
                return sbi.a;
            case 11:
                hpg hpgVar = (hpg) this.f;
                ch3.d0(obj);
                List list13 = hpgVar.a;
                if (list13 != null && (list = hpgVar.b) != null && (list2 = hpgVar.c) != null && (a4gVar = hpgVar.d) != null) {
                    tpg tpgVar = (tpg) this.g;
                    zv8[] zv8VarArr3 = tpg.u;
                    ArrayList arrayList3 = new ArrayList();
                    boolean zA = ((f5d) ((wo6) tpgVar.i.getValue())).A();
                    if (list13.isEmpty()) {
                        j = 0;
                        omgVar = null;
                    } else {
                        j = 0;
                        omgVar = new omg(-9223372036854775807L, new tnh(R.string.oneme_media_keyboard_recent), null, Integer.valueOf(R.drawable.icon_clock_mini), tpg.E(tpg.D(4, -9223372036854775807L, list13), zA), 1, ((ipg) tpgVar.n.getValue()).a == 0, false, false, null, false, 1412);
                    }
                    omg omgVar4 = !list.isEmpty() ? new omg(-9223372036854775806L, new tnh(R.string.oneme_media_keyboard_favorite), null, Integer.valueOf(R.drawable.icon_bookmark), tpg.E(tpg.D(6, -9223372036854775806L, list), zA && omgVar == null), 2, omgVar == null, false, false, null, false, 1412) : null;
                    List list14 = a4gVar.a;
                    omg omgVar5 = !list14.isEmpty() ? new omg(-9223372036854775805L, new tnh(R.string.oneme_media_keyboard_popular), null, Integer.valueOf(R.drawable.icon_flame), tpg.E(tpg.D(5, -9223372036854775805L, list14), zA && omgVar == null && omgVar4 == null), 3, omgVar == null && omgVar4 == null, false, false, null, false, 1412) : null;
                    List listN1 = ww3.N1(a4gVar.b, 100);
                    ArrayList<emg> arrayList4 = new ArrayList();
                    for (Object obj9 : listN1) {
                        emg emgVar2 = (emg) obj9;
                        List list15 = list2;
                        if ((list15 instanceof Collection) && list15.isEmpty()) {
                            list3 = list2;
                            arrayList4.add(obj9);
                        } else {
                            Iterator it2 = list15.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    list3 = list2;
                                    if (emgVar2.a != ((emg) it2.next()).a) {
                                        list2 = list3;
                                    }
                                } else {
                                    list3 = list2;
                                    arrayList4.add(obj9);
                                }
                            }
                        }
                        list2 = list3;
                    }
                    List<emg> list16 = list2;
                    c79 c79VarW = yab.w();
                    c79VarW.add(wk6.a);
                    if (omgVar != null) {
                        tpg.B(c79VarW, omgVar, arrayList3);
                    }
                    if (omgVar4 != null) {
                        tpg.B(c79VarW, omgVar4, arrayList3);
                    }
                    if (omgVar5 != null) {
                        tpg.B(c79VarW, omgVar5, arrayList3);
                    }
                    Long lValueOf = (((f5d) ((wo6) tpgVar.i.getValue())).A() && omgVar == null && omgVar4 == null && omgVar5 == null && ((emgVar = (emg) ww3.t1(list16)) != null || (emgVar = (emg) ww3.t1(arrayList4)) != null)) ? Long.valueOf(emgVar.a) : null;
                    for (emg emgVar3 : list16) {
                        tpg.B(c79VarW, tpg.C(emgVar3, 4, lValueOf != null && emgVar3.a == lValueOf.longValue()), arrayList3);
                    }
                    for (emg emgVar4 : arrayList4) {
                        omg omgVarC = tpg.C(emgVar4, 5, lValueOf != null && emgVar4.a == lValueOf.longValue());
                        arrayList3.add(new co2(omgVarC.a, omgVarC));
                        c79VarW.add(omgVarC);
                    }
                    c79 c79VarJ = yab.j(c79VarW);
                    String name2 = tpg.class.getName();
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 == null) {
                        obj3 = null;
                    } else {
                        je9 je9Var2 = je9.d;
                        if (a4cVar2.b(je9Var2)) {
                            obj3 = null;
                            a4cVar2.c(je9Var2, name2, qt4.l("stickers loaded, sets:", arrayList3.size(), c79VarJ.getSize(), ",content:"), null);
                        } else {
                            obj3 = null;
                        }
                    }
                    jpg jpgVar = new jpg(arrayList3, c79VarJ);
                    mjg mjgVar4 = ((tpg) this.g).k;
                    mjgVar4.getClass();
                    mjgVar4.j(obj3, jpgVar);
                    tpg tpgVar2 = (tpg) this.g;
                    long j3 = j;
                    long andSet = tpgVar2.m.getAndSet(j3);
                    if (andSet > j3) {
                        Iterator it3 = ((jpg) tpgVar2.k.getValue()).a.iterator();
                        int i9 = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                i5 = -1;
                            } else if (((co2) it3.next()).b.a == andSet) {
                                i5 = i9;
                            } else {
                                i9++;
                            }
                        }
                        int i10 = i5 - 1;
                        mjg mjgVar5 = tpgVar2.n;
                        ipg ipgVar = new ipg(andSet, 0, i10 < 0 ? 0 : i10, 2);
                        mjgVar5.getClass();
                        mjgVar5.j(null, ipgVar);
                        tpgVar2.F(andSet, null);
                    }
                }
                return sbi.a;
            case 12:
                String str3 = (String) this.f;
                ch3.d0(obj);
                x9h x9hVar = (x9h) this.g;
                int iIntValue3 = ((Number) x9hVar.x.getValue()).intValue();
                mjg mjgVar6 = x9hVar.y;
                if (str3 == null || r5h.X0(str3)) {
                    vo8 vo8Var = (vo8) x9hVar.C.m(x9hVar, x9h.J[0]);
                    if (vo8Var != null) {
                        vo8Var.b(null);
                    }
                    mjg mjgVar7 = x9hVar.s;
                    do {
                        value = mjgVar7.getValue();
                    } while (!mjgVar7.h(value, null));
                    do {
                        value2 = mjgVar6.getValue();
                    } while (!mjgVar6.h(value2, null));
                } else {
                    u9h u9hVar = (u9h) mjgVar6.getValue();
                    if (u9hVar != null && !r5h.L0(str3, u9hVar.i(), false)) {
                        do {
                            value3 = mjgVar6.getValue();
                        } while (!mjgVar6.h(value3, null));
                    }
                    x9hVar.E(iIntValue3, str3.toString());
                }
                return sbi.a;
            case 13:
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) this.g;
                Object obj10 = this.f;
                ch3.d0(obj);
                q9h q9hVar = (q9h) obj10;
                if (q9hVar == null) {
                    zv8[] zv8VarArr4 = SuggestionsWidget.F;
                    mjg mjgVar8 = suggestionsWidget.J1().y;
                    do {
                        value4 = mjgVar8.getValue();
                    } while (!mjgVar8.h(value4, null));
                    suggestionsWidget.v1(true);
                } else {
                    ArrayList arrayList5 = q9hVar.b;
                    boolean zIsEmpty = arrayList5.isEmpty();
                    zv8[] zv8VarArr5 = SuggestionsWidget.F;
                    suggestionsWidget.G1().setVisibility(zIsEmpty ? 0 : 8);
                    suggestionsWidget.I1().setVisibility(!zIsEmpty ? 0 : 8);
                    ((View) suggestionsWidget.s.m(suggestionsWidget, SuggestionsWidget.F[4])).setVisibility(zIsEmpty ? 8 : 0);
                    suggestionsWidget.G1().setText(q9hVar.a == o9h.c ? R.string.writebar_commands_not_found : R.string.writebar_mentions_not_found);
                    ((t9h) suggestionsWidget.q.getValue()).H(arrayList5);
                }
                return sbi.a;
            case 14:
                ch3.d0(obj);
                ((mnh) this.f).b((Layout) ((ifh) this.g).getValue());
                return sbi.a;
            case 15:
                Object obj11 = this.f;
                ch3.d0(obj);
                ((ThreadsStateViewerScreen) this.g).e.H((List) obj11);
                return sbi.a;
            case 16:
                ch3.d0(obj);
                x3i x3iVar = (x3i) this.f;
                File file = ((re8) ((te8) this.g)).b;
                zv8[] zv8VarArr6 = x3i.w;
                x3iVar.getClass();
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var3 = je9.d;
                    if (a4cVar3.b(je9Var3)) {
                        a4cVar3.c(je9Var3, "TransparentLogic", zo5.m(file, "update: downloadedFile="), null);
                    }
                }
                if (file == null) {
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null) {
                        je9 je9Var4 = je9.f;
                        if (a4cVar4.b(je9Var4)) {
                            a4cVar4.c(je9Var4, "TransparentLogic", "Can't update app from informer because file is null", null);
                        }
                    }
                } else {
                    new kr6(x3iVar.a, (ju6) x3iVar.m.getValue(), (lsi) x3iVar.e.getValue()).O(file);
                }
                return sbi.a;
            case 17:
                sbi sbiVar = sbi.a;
                String str4 = (String) this.g;
                ch3.d0(obj);
                j6i j6iVar = (j6i) this.f;
                mjg mjgVar9 = j6iVar.o;
                x8i x8iVar = (x8i) mjgVar9.getValue();
                if (x8iVar instanceof s8i) {
                    String str5 = (String) j6iVar.q.getAndUpdate(new ung(str4, 2));
                    s8i s8iVar = (s8i) x8iVar;
                    v8i v8iVar = s8iVar.c;
                    if (v8iVar.c != null && !cqk.d(str5, str4)) {
                        s8i s8iVar2 = new s8i(s8iVar.a, s8iVar.b, v8i.a(v8iVar, null));
                        mjgVar9.getClass();
                        mjgVar9.j(null, s8iVar2);
                    }
                }
                return sbiVar;
            case 18:
                Object obj12 = this.f;
                ch3.d0(obj);
                ((b9i) this.g).f((x8i) obj12);
                return sbi.a;
            case 19:
                UnknownContactBottomSheet unknownContactBottomSheet = (UnknownContactBottomSheet) this.g;
                Object obj13 = this.f;
                ch3.d0(obj);
                fci fciVar = (fci) obj13;
                if (fciVar instanceof dci) {
                    unknownContactBottomSheet.v1(true);
                } else {
                    if (!(fciVar instanceof eci)) {
                        ore.o();
                        return null;
                    }
                    h8c h8cVar = new h8c(unknownContactBottomSheet);
                    eci eciVar = (eci) fciVar;
                    h8cVar.m(eciVar.a);
                    h8cVar.h(new w8c(eciVar.b));
                    h8cVar.l(eciVar.c);
                    h8cVar.p();
                    unknownContactBottomSheet.v1(true);
                }
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ylc ylcVar3 = (ylc) this.f;
                ch3.d0(obj);
                vg4 vg4Var = (vg4) ylcVar3.a;
                rt2 rt2Var = (rt2) ylcVar3.b;
                v05 v05Var = (v05) this.g;
                mjg mjgVar10 = (mjg) v05Var.l;
                boolean z4 = !((f5d) ((wo6) ((ny8) v05Var.j).getValue())).y() || rt2Var == null || (nx2Var = rt2Var.b) == null || (nx2Var.q0 & 1) != 0;
                boolean zC = ((jcd) ((ny8) v05Var.k).getValue()).c(rt2Var, vg4Var);
                if (!z4 || vg4Var.f || vg4Var.h() || vg4Var.D() || zC) {
                    mjgVar10.setValue(null);
                } else {
                    bci bciVar = new bci(vg4Var.v());
                    mjgVar10.getClass();
                    mjgVar10.j(null, bciVar);
                }
                return sbi.a;
            case 21:
                vfi vfiVar = (vfi) this.f;
                ch3.d0(obj);
                String str6 = ((zgi) this.g).c;
                a4c a4cVar5 = gm0.f;
                if (a4cVar5 != null) {
                    je9 je9Var5 = je9.d;
                    if (a4cVar5.b(je9Var5)) {
                        a4cVar5.c(je9Var5, str6, "uploadFile: " + vfiVar, null);
                    }
                }
                return sbi.a;
            case 22:
                vii viiVar = (vii) this.f;
                ch3.d0(obj);
                zgi zgiVar = (zgi) ((cii) this.g).e.getValue();
                ahi ahiVar = viiVar.a;
                zui zuiVar = viiVar.b;
                zgiVar.getClass();
                return e9i.r(new h30(zgiVar, ahiVar, zuiVar, (lq4) null, 4));
            case 23:
                ch3.d0(obj);
                ((nmf) this.f).a(((DeferrableSurface$SurfaceClosedException) this.g).a);
                return sbi.a;
            case 24:
                return l(obj);
            case 25:
                pti ptiVar = (pti) this.g;
                sbi sbiVar2 = sbi.a;
                l4d l4dVar = (l4d) this.f;
                ch3.d0(obj);
                String str7 = l4dVar.b;
                if (str7 != null && (ltiVar = (lti) ptiVar.y.c(str7)) != null && !ltiVar.h && ltiVar.b == l4dVar.a) {
                    ptiVar.c(ltiVar.c, ltiVar.a);
                }
                return sbiVar2;
            case 26:
                ch3.d0(obj);
                Float f = (Float) this.f;
                hyi hyiVar = (hyi) this.g;
                if (f == null) {
                    e3j e3jVar = hyi.a(hyiVar).h;
                    if (e3jVar != null) {
                        e3jVar.play();
                    }
                } else {
                    hyi.a(hyiVar).r(f.floatValue());
                }
                return sbi.a;
            case 27:
                h50 h50Var5 = (h50) this.f;
                ch3.d0(obj);
                izi iziVar = (izi) this.g;
                zv8[] zv8VarArr7 = izi.y1;
                iziVar.f0(h50Var5);
                return sbi.a;
            case 28:
                sbi sbiVar3 = sbi.a;
                ch3.d0(obj);
                g1j g1jVar = (g1j) this.f;
                Bitmap bitmapA = ((vyi) g1jVar.l.getValue()).a(g1j.Q, (byte[]) this.g);
                if (bitmapA != null) {
                    Uri uriN = g1j.n(g1jVar, bitmapA);
                    mjg mjgVar11 = g1jVar.s;
                    do {
                        value5 = mjgVar11.getValue();
                    } while (!mjgVar11.h(value5, w0j.a((w0j) value5, null, uriN.toString(), null, 5)));
                }
                return sbiVar3;
            default:
                kbc kbcVar = (kbc) this.f;
                ch3.d0(obj);
                CharSequence text = ((TextView) this.g).getText();
                if (text != null) {
                    vd7.h(text, kbcVar);
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8g(lq4 lq4Var, Object obj, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8g(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8g(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
