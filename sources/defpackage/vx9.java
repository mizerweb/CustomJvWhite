package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.media.AudioRecord;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spanned;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import one.me.messages.list.loader.MessageModel;
import one.me.polls.screens.create.PollCreateScreen;
import one.me.sdk.gallery.MediaGalleryWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vx9 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vx9(z2 z2Var, f1d f1dVar, View view) {
        this.a = 24;
        this.b = z2Var;
        this.c = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.af7
    public final Object invoke() {
        int i;
        Object[] spans;
        geg gegVar;
        Object next;
        int iNextIndex;
        Object value;
        lValueOf = null;
        Long lValueOf = null;
        ValueAnimator valueAnimator = null;
        switch (this.a) {
            case 0:
                MediaGalleryWidget mediaGalleryWidget = (MediaGalleryWidget) this.b;
                Bundle bundle = (Bundle) this.c;
                fj7 fj7Var = (fj7) mediaGalleryWidget.c.getAccessor().c(781);
                Object objF0 = tre.f0(bundle, "arg_gallery_mode", ph7.class);
                if (objF0 == null) {
                    c.o(c0a.o("No value passed for key arg_gallery_mode of type ", ph7.class.getSimpleName(), " in bundle"));
                    return null;
                }
                Context context = mediaGalleryWidget.getContext();
                gi7 gi7VarQ1 = mediaGalleryWidget.q1();
                fj7Var.getClass();
                return new ej7((ph7) ((Parcelable) objF0), context, gi7VarQ1, fj7Var.a, fj7Var.b, fj7Var.c, fj7Var.d, fj7Var.e, fj7Var.f, fj7Var.g);
            case 1:
                Context context2 = (Context) this.b;
                uy9 uy9Var = (uy9) this.c;
                FrameLayout frameLayout = new FrameLayout(context2);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 8388661;
                frameLayout.setLayoutParams(layoutParams);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                npb npbVar = new npb(context2);
                npbVar.setId(R.id.gallery_numeric_check_button);
                npbVar.setLayoutParams(new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density)));
                npbVar.setGravity(17);
                npbVar.setMaxLines(1);
                npbVar.setSingleLine(true);
                npbVar.setPadding(0, 0, 0, 0);
                npbVar.setTextAlignment(1);
                pq3.j.l(npbVar);
                npbVar.setTextColor(-1);
                q9i.a(q9i.d, npbVar);
                frameLayout.addView(npbVar);
                uy9Var.addView(frameLayout);
                int iK = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
                qyj.z(iK, iK, iK, iK, frameLayout, npbVar);
                return npbVar;
            case 2:
                kz9 kz9Var = (kz9) this.b;
                af7 af7Var = (af7) this.c;
                tw8 tw8Var = (tw8) kz9Var.d.invoke();
                if (tw8Var != null) {
                    tw8Var.r0(true);
                }
                af7Var.invoke();
                return sbi.a;
            case 3:
                dsc dscVar = (dsc) this.b;
                b5d b5dVar = ((u4a) this.c).b().b.b().a.R0;
                zv8[] zv8VarArr = e5d.S6;
                List list = (List) b5dVar.a(zv8VarArr[94]).i();
                if (list.isEmpty()) {
                    list = (List) b5dVar.a(zv8VarArr[94]).b;
                }
                int[] iArrS1 = ww3.S1(list);
                if (iArrS1.length < 3) {
                    dscVar.getClass();
                    iArrS1 = gp0.n;
                }
                int iOrdinal = dscVar.a.ordinal();
                if (iOrdinal == 0) {
                    i = iArrS1[0];
                } else if (iOrdinal == 1) {
                    i = iArrS1[1];
                } else {
                    if (iOrdinal != 2) {
                        ore.o();
                        return null;
                    }
                    i = iArrS1[2];
                }
                return Integer.valueOf(i);
            case 4:
                return new e8e(((tda) this.b).g, (lsa) this.c);
            case 5:
                return tha.d((Context) this.b, (tha) this.c);
            case 6:
                ljf ljfVar = (ljf) this.b;
                MessageModel messageModelR = ((jsa) ljfVar.b).R(((MessageModel) this.c).a);
                return a8e.L((a8e) ljfVar.c, messageModelR != null ? messageModelR.w : null, false, 4);
            case 7:
                qka qkaVar = (qka) this.b;
                ny8 ny8Var = (ny8) this.c;
                xt4 xt4VarR0 = ((n0c) qkaVar.b).b().R0(1, "messageViewCountController");
                vt4 vt4Var = (vt4) ny8Var.getValue();
                xt4VarR0.getClass();
                return cqk.a(lvb.x0(xt4VarR0, vt4Var));
            case 8:
                ((qqa) this.b).e((RecyclerView) this.c);
                return sbi.a;
            case 9:
                jsa jsaVar = (jsa) this.b;
                return yab.h0(jsaVar.b, jsaVar.w, 2, new af8(jsaVar, (una) this.c, (lq4) null, 24));
            case 10:
                bwa bwaVar = (bwa) this.b;
                ny8 ny8Var2 = (ny8) this.c;
                List<jl> listK = ((xm) bwaVar.e.getValue()).k();
                ArrayList arrayList = new ArrayList(yw3.W0(listK, 10));
                for (jl jlVar : listK) {
                    s5e s5eVarC = ((lja) bwaVar.f.getValue()).c(jlVar.b, gm0.K(bwaVar.d.a() * yl5.d().getDisplayMetrics().density), ((xm) ny8Var2.getValue()).h(jlVar.a));
                    long j = jlVar.a;
                    CharSequence charSequence = s5eVarC.a;
                    int length = charSequence.length();
                    try {
                        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
                        spans = spanned != null ? spanned.getSpans(0, length, geg.class) : null;
                    } catch (Throwable unused) {
                    }
                    geg[] gegVarArr = (geg[]) spans;
                    arrayList.add(new g6e(j, s5eVarC, (gegVarArr == null || (gegVar = (geg) a.b1(gegVarArr)) == null) ? null : gegVar.b(), false));
                }
                return arrayList;
            case 11:
                bwi bwiVar = (bwi) this.b;
                rya ryaVar = (rya) this.c;
                String str = ryaVar.b;
                nf2 nf2Var = ryaVar.c;
                bwiVar.getClass();
                awi awiVarA = bwi.a(str);
                if (awiVarA == null) {
                    return new qya();
                }
                Set setC = nf2Var.c();
                if (setC.isEmpty()) {
                    return new qya();
                }
                LinkedHashMap linkedHashMap = qui.a;
                String str2 = ix5.a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Map.Entry entry : ((Map) ix5.g.getValue()).entrySet()) {
                    fx5 fx5Var = (fx5) entry.getKey();
                    d87 d87Var = (d87) entry.getValue();
                    d87Var.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = d87Var.a.values().iterator();
                    while (it.hasNext()) {
                        Set set = (Set) ((Map) it.next()).get(str);
                        if (set != null) {
                            arrayList2.addAll(set);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        linkedHashSet.add(fx5Var);
                    }
                }
                LinkedHashSet linkedHashSetW1 = ww3.w1(setC, linkedHashSet);
                if (linkedHashSetW1.isEmpty()) {
                    return new qya();
                }
                HashSet hashSetR1 = ww3.R1(nf2Var.q(34));
                pi0 pi0Var = pi0.e;
                ArrayList arrayList3 = new ArrayList(pi0.m);
                ArrayList<pi0> arrayList4 = new ArrayList();
                for (Object obj : arrayList3) {
                    if (obj instanceof pi0) {
                        arrayList4.add(obj);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for (pi0 pi0Var2 : arrayList4) {
                    Iterator it2 = pi0Var2.d.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            Size size = (Size) next;
                            if (!hashSetR1.contains(size) || !awiVarA.e(size.getWidth(), size.getHeight())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    Size size2 = (Size) next;
                    ylc ylcVar = size2 != null ? new ylc(pi0Var2, size2) : null;
                    if (ylcVar != null) {
                        arrayList5.add(ylcVar);
                    }
                }
                Map mapW0 = wm9.W0(arrayList5);
                return mapW0.isEmpty() ? new qya() : new qya(linkedHashSetW1, mapW0);
            case 12:
                return MultiFileUploader.multiUploadHelper_delegate$lambda$0((MultiFileUploader) this.b, (EventChannel) this.c);
            case 13:
                y7b y7bVar = (y7b) this.b;
                String name = ((l72) ((zv8) this.c)).getName();
                Object obj2 = y7bVar.c;
                Object obj3 = y7bVar.a;
                boolean z = y7bVar.b;
                StringBuilder sbQ = qv1.q("Feature", "", " ", name, ": ");
                sbQ.append(obj2);
                sbQ.append(", default: ");
                sbQ.append(obj3);
                sbQ.append(", modified: ");
                sbQ.append(z);
                return sbQ.toString();
            case 14:
                String str3 = (String) this.b;
                na6 na6Var = (na6) this.c;
                d6h d6hVar = d6h.f;
                fif[] fifVarArr = new fif[0];
                if (r5h.X0(str3)) {
                    ore.p("Blank serial names are prohibited");
                    return null;
                }
                if (d6hVar == c6h.f) {
                    ore.p("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                    return null;
                }
                tr3 tr3Var = new tr3(str3);
                tr3Var.b = (List) na6Var.c;
                return new hif(str3, d6hVar, tr3Var.c.size(), a.n1(fifVarArr), tr3Var);
            case 15:
                Context context3 = (Context) this.b;
                uxb uxbVar = (uxb) this.c;
                q9c q9cVar = new q9c(context3);
                q9cVar.setAvatarSize(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
                q9cVar.setOverlayType(o9c.b);
                uxbVar.addView(q9cVar, new ViewGroup.LayoutParams(-2, -2));
                return q9cVar;
            case 16:
                Context context4 = (Context) this.b;
                fyb fybVar = (fyb) this.c;
                r6c r6cVar = new r6c(context4);
                r6cVar.setId(R.id.oneme_button_progress_bar_id);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                r6cVar.setLayoutParams(layoutParams2);
                r6cVar.setAppearance(e6c.a);
                r6cVar.setSize(m6c.a);
                n7j.a(fybVar, r6cVar, -1);
                return r6cVar;
            case 17:
                return new lzb((ny8) this.b, ((q36) this.c).a);
            case 18:
                ll5 ll5Var = (ll5) this.b;
                j8c j8cVar = (j8c) this.c;
                i8c i8cVar = (i8c) ll5Var.f;
                if (i8cVar != null) {
                    i8cVar.w(j8cVar);
                }
                return sbi.a;
            case 19:
                Context context5 = (Context) this.b;
                ubc ubcVar = (ubc) this.c;
                r6c r6cVar2 = new r6c(context5);
                r6cVar2.setId(R.id.oneme_button_progress_bar_id);
                r6cVar2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                bdc.a(r6cVar2, new rda(7, r6cVar2, ubcVar));
                n7j.a(ubcVar, r6cVar2, Integer.valueOf(ubcVar.getChildCount()));
                return r6cVar2;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                rcc rccVar = (rcc) this.b;
                af7 af7Var2 = (af7) this.c;
                rccVar.r();
                af7Var2.invoke();
                return sbi.a;
            case 21:
                ((tcc) this.b).setOffEditMode((af7) this.c);
                return sbi.a;
            case 22:
                int[] iArr = (int[]) this.b;
                pec pecVar = (pec) this.c;
                ArrayList arrayList6 = new ArrayList(iArr.length);
                for (int i2 : iArr) {
                    arrayList6.add(pecVar.d[pecVar.k(i2)]);
                }
                List list2 = (List) pecVar.y.getValue();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj4 : list2) {
                    if (arrayList6.contains((b87) obj4)) {
                        arrayList7.add(obj4);
                    }
                }
                ArrayList arrayList8 = new ArrayList(yw3.W0(arrayList7, 10));
                Iterator it3 = arrayList7.iterator();
                while (it3.hasNext()) {
                    kwi kwiVarE = srk.e((b87) it3.next());
                    arrayList8.add(new t4j(q3m.e(kwiVarE), kwiVarE, true));
                }
                return arrayList8;
            case 23:
                AudioRecord audioRecord = (AudioRecord) this.b;
                ByteBuffer byteBuffer = (ByteBuffer) this.c;
                return Integer.valueOf(audioRecord.read(byteBuffer, byteBuffer.capacity()));
            case 24:
                z2 z2Var = (z2) this.b;
                View view = (View) this.c;
                z2Var.invoke();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                if (valueAnimatorOfFloat != null) {
                    valueAnimatorOfFloat.setDuration(200L);
                    valueAnimatorOfFloat.addUpdateListener(new z6(view, 5));
                    valueAnimator = valueAnimatorOfFloat;
                }
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                return sbi.a;
            case 25:
                d6d d6dVar = (d6d) this.b;
                l7d l7dVar = (l7d) this.c;
                q7d q7dVar = d6dVar.u;
                if (q7dVar != null) {
                    long j2 = l7dVar.c;
                    PollCreateScreen pollCreateScreen = q7dVar.a;
                    zv8[] zv8VarArr2 = PollCreateScreen.n;
                    y7d y7dVarP1 = pollCreateScreen.p1();
                    ic6 ic6Var = y7dVarP1.g;
                    mjg mjgVar = y7dVarP1.d;
                    if (((x8d) mjgVar.getValue()).a.size() > 1) {
                        List list3 = ((x8d) mjgVar.getValue()).a;
                        ListIterator listIterator = list3.listIterator(list3.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                iNextIndex = -1;
                            } else if (((l7d) listIterator.previous()).c == j2) {
                                iNextIndex = listIterator.nextIndex();
                            }
                        }
                        if (iNextIndex == -1) {
                            gm0.n(y7dVarP1.j, "early return in onRemoveAnswer cuz of no itemId in answers list");
                        } else {
                            ArrayList arrayList9 = new ArrayList(list3);
                            arrayList9.remove(iNextIndex);
                            do {
                                value = mjgVar.getValue();
                            } while (!mjgVar.h(value, x8d.a((x8d) value, arrayList9, false, 2)));
                            l7d l7dVar2 = (l7d) ww3.u1(iNextIndex > 0 ? iNextIndex - 1 : 1, list3);
                            if (l7dVar2 != null) {
                                lValueOf = Long.valueOf(l7dVar2.c);
                            }
                        }
                        if (lValueOf != null) {
                            a8j.x(ic6Var, new fme(lValueOf.longValue()));
                        }
                    } else {
                        a8j.x(ic6Var, jv7.a);
                    }
                }
                return sbi.a;
            case 26:
                return h7d.a((Context) this.b, (h7d) this.c);
            case 27:
                Context context6 = (Context) this.b;
                q8d q8dVar = (q8d) this.c;
                dka dkaVar = new dka(context6);
                dkaVar.setOnLongClickListener(new cw0(5, q8dVar));
                dkaVar.setOnClickListener(new gwc(5, q8dVar));
                q8dVar.addView(dkaVar, new ViewGroup.LayoutParams(-2, -2));
                return dkaVar;
            case 28:
                q8d q8dVar2 = (q8d) this.b;
                e7d e7dVar = (e7d) this.c;
                q8dVar2.a.invoke(new jna(e7dVar, e7dVar.a));
                return sbi.a;
            default:
                ((z8d) ((h47) this.b).g).b(((u9d) ((e9d) this.c)).a);
                return sbi.a;
        }
    }

    public /* synthetic */ vx9(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
