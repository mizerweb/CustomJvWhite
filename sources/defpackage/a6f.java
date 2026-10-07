package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class a6f implements gjg {
    public final /* synthetic */ int a;
    public final Object b;

    public a6f() {
        this.a = 0;
        this.b = p90.a(null);
    }

    public static void e(a6f a6fVar, long j, i5f i5fVar, boolean z, boolean z2, int i, int i2) {
        ((f9b) a6fVar.b).setValue(new x5f(j, false, (i2 & 8) != 0 ? true : z2, i5fVar, (i2 & 4) != 0 ? false : z, -1, -1L, (i2 & 64) != 0 ? 0 : i));
    }

    public static void i(a6f a6fVar, long j, i5f i5fVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            i5fVar = i5f.a;
        }
        ((f9b) a6fVar.b).setValue(new x5f(j, false, i5fVar, (i2 & 8) == 0, 0L, (i2 & 4) != 0 ? 0 : i, 96));
    }

    public static void j(a6f a6fVar, long j, i5f i5fVar, long j2, int i) {
        if ((i & 2) != 0) {
            i5fVar = i5f.a;
        }
        ((f9b) a6fVar.b).setValue(new x5f(j, true, i5fVar, false, (i & 8) != 0 ? -1L : j2, 0, 160));
    }

    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005e -> B:18:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.xx6
    public final java.lang.Object collect(defpackage.yx6 r8, defpackage.lq4 r9) {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L61;
                default: goto L5;
            }
        L5:
            boolean r0 = r9 instanceof defpackage.brh
            if (r0 == 0) goto L18
            r0 = r9
            brh r0 = (defpackage.brh) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.g = r1
            goto L1d
        L18:
            brh r0 = new brh
            r0.<init>(r7, r9)
        L1d:
            java.lang.Object r9 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            hu4 r4 = defpackage.hu4.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            yx6 r8 = r0.d
            goto L3b
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            r4 = 0
            goto L60
        L35:
            yx6 r8 = r0.d
            defpackage.ch3.d0(r9)
            goto L54
        L3b:
            defpackage.ch3.d0(r9)
        L3e:
            vt4 r9 = r0.getContext()
            defpackage.vd7.q(r9)
            java.util.List r9 = r7.g()
            r0.d = r8
            r0.g = r3
            java.lang.Object r9 = r8.emit(r9, r0)
            if (r9 != r4) goto L54
            goto L60
        L54:
            r0.d = r8
            r0.g = r2
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r9 = defpackage.rx8.t(r5, r0)
            if (r9 != r4) goto L3e
        L60:
            return r4
        L61:
            java.lang.Object r7 = r7.b
            f9b r7 = (defpackage.f9b) r7
            java.lang.Object r7 = r7.collect(r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6f.collect(yx6, lq4):java.lang.Object");
    }

    @Override // defpackage.lzf
    public final List d() {
        switch (this.a) {
            case 0:
                return ((f9b) this.b).d();
            default:
                return r66.a;
        }
    }

    public x5f f() {
        return (x5f) ((f9b) this.b).getValue();
    }

    public List g() {
        int iIntValue;
        crh crhVar = (crh) this.b;
        ArrayList arrayListR0 = xw3.R0(new e55(crhVar.a, new tnh(R.string.oneme_settings_dump_threads), R.drawable.icon_copy, null, b55.a, 8));
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Map mapA = qxl.a(allStackTraces);
        Iterator it = arh.a.iterator();
        while (true) {
            iIntValue = 0;
            if (!it.hasNext()) {
                break;
            }
            Thread.State state = (Thread.State) it.next();
            long j = ((ej5) crhVar.e.computeIfAbsent(state, new am(24, new u8h(12)))).a;
            String strName = state.name();
            Integer num = (Integer) ((LinkedHashMap) mapA).get(state);
            if (num != null) {
                iIntValue = num.intValue();
            }
            arrayListR0.add(new e55(j, new vnh(R.string.oneme_settings_thread_state_count, a.n1(new Object[]{strName, Integer.valueOf(iIntValue)})), R.drawable.icon_info_fill, null, null, 24));
        }
        long j2 = crhVar.b;
        Iterator it2 = ((LinkedHashMap) mapA).values().iterator();
        int iIntValue2 = 0;
        while (it2.hasNext()) {
            iIntValue2 += ((Number) it2.next()).intValue();
        }
        arrayListR0.add(new e55(j2, new vnh(R.string.oneme_settings_thread_state_count, a.n1(new Object[]{"Total", Integer.valueOf(iIntValue2)})), R.drawable.icon_info_fill, null, null, 24));
        if (!allStackTraces.isEmpty()) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = allStackTraces.entrySet().iterator();
            int i = 0;
            while (it3.hasNext()) {
                if (z5h.K0(it3.next().getKey().getName(), "tracer-", false)) {
                    i++;
                }
            }
            iIntValue = i;
        }
        arrayListR0.add(new e55(crhVar.c, new vnh(R.string.oneme_settings_thread_tracer, a.n1(new Object[]{Integer.valueOf(iIntValue)})), R.drawable.icon_attachment, null, null, 24));
        arrayListR0.add(new e55(crhVar.d, new vnh(R.string.oneme_settings_thread_viewer_state, a.n1(new Object[]{Integer.valueOf(iIntValue)})), R.drawable.icon_services, null, null, 24));
        return arrayListR0;
    }

    @Override // defpackage.gjg
    public final /* bridge */ /* synthetic */ Object getValue() {
        switch (this.a) {
            case 0:
                return f();
            default:
                return g();
        }
    }

    public a6f(crh crhVar) {
        this.a = 1;
        this.b = crhVar;
    }
}
