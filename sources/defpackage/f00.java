package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioRecord;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import one.me.messages.list.loader.MessageModel;
import one.me.profile.screens.media.ChatMediaListWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class f00 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;
    public Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f00(ww2 ww2Var, int i, xn3 xn3Var, Set set, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 25;
        this.h = ww2Var;
        this.f = i;
        this.i = xn3Var;
        this.j = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        if (r8 == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object A(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.g
            gu4 r0 = (defpackage.gu4) r0
            hu4 r1 = defpackage.hu4.a
            int r2 = r7.f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L20
            if (r2 == r5) goto L1c
            if (r2 != r4) goto L15
            defpackage.ch3.d0(r8)
            goto L62
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            r7 = 0
            return r7
        L1c:
            defpackage.ch3.d0(r8)
            goto L3a
        L20:
            defpackage.ch3.d0(r8)
            java.lang.Object r8 = r7.h
            f64 r8 = (defpackage.f64) r8
            java.lang.Object r2 = r7.i
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.Object r6 = r7.j
            long[] r6 = (long[]) r6
            r7.g = r0
            r7.f = r5
            java.lang.Enum r8 = defpackage.f64.B(r8, r2, r6, r7)
            if (r8 != r1) goto L3a
            goto L61
        L3a:
            q54 r8 = (defpackage.q54) r8
            java.lang.Object r2 = r7.h
            f64 r2 = (defpackage.f64) r2
            r2.p = r8
            java.lang.Object r2 = r7.h
            f64 r2 = (defpackage.f64) r2
            ny8 r2 = r2.l
            java.lang.Object r2 = r2.getValue()
            l54 r2 = (defpackage.l54) r2
            byte r8 = r8.a
            r7.g = r0
            r7.f = r4
            rre r0 = r2.a
            k54 r2 = new k54
            r2.<init>(r8)
            java.lang.Object r8 = defpackage.ch3.I(r7, r0, r5, r3, r2)
            if (r8 != r1) goto L62
        L61:
            return r1
        L62:
            m54 r8 = (defpackage.m54) r8
            if (r8 == 0) goto L6c
            java.util.List r8 = r8.c
            if (r8 != 0) goto L6b
            goto L6c
        L6b:
            return r8
        L6c:
            java.lang.Object r7 = r7.h
            f64 r7 = (defpackage.f64) r7
            ny8 r7 = r7.m
            java.lang.Object r7 = r7.getValue()
            o54 r7 = (defpackage.o54) r7
            r7.a(r3)
            r66 r7 = defpackage.r66.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f00.A(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d4, code lost:
    
        if (r15.a(r1, r7, r14) == r11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010e, code lost:
    
        if (r15.collect(r2, r14) == r11) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object B(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f00.B(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002e A[Catch: CancellationException | ClosedReceiveChannelException -> 0x00c3, CancellationException | ClosedReceiveChannelException -> 0x00c3, TRY_ENTER, TryCatch #3 {CancellationException | ClosedReceiveChannelException -> 0x00c3, blocks: (B:7:0x0014, B:19:0x002e, B:19:0x002e, B:21:0x0034, B:21:0x0034, B:24:0x0046, B:24:0x0046, B:43:0x00b5, B:43:0x00b5, B:37:0x0089, B:37:0x0089, B:40:0x0099, B:40:0x0099, B:42:0x00a1, B:42:0x00a1, B:27:0x0051, B:27:0x0051, B:29:0x0059, B:29:0x0059, B:46:0x00c2, B:46:0x00c2, B:16:0x0027, B:16:0x0027), top: B:54:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0034 A[Catch: CancellationException | ClosedReceiveChannelException -> 0x00c3, CancellationException | ClosedReceiveChannelException -> 0x00c3, TryCatch #3 {CancellationException | ClosedReceiveChannelException -> 0x00c3, blocks: (B:7:0x0014, B:19:0x002e, B:19:0x002e, B:21:0x0034, B:21:0x0034, B:24:0x0046, B:24:0x0046, B:43:0x00b5, B:43:0x00b5, B:37:0x0089, B:37:0x0089, B:40:0x0099, B:40:0x0099, B:42:0x00a1, B:42:0x00a1, B:27:0x0051, B:27:0x0051, B:29:0x0059, B:29:0x0059, B:46:0x00c2, B:46:0x00c2, B:16:0x0027, B:16:0x0027), top: B:54:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046 A[Catch: CancellationException | ClosedReceiveChannelException -> 0x00c3, CancellationException | ClosedReceiveChannelException -> 0x00c3, PHI: r14
  0x0046: PHI (r14v4 java.lang.Object) = (r14v11 java.lang.Object), (r14v0 java.lang.Object) binds: [B:22:0x0042, B:16:0x0027] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {CancellationException | ClosedReceiveChannelException -> 0x00c3, blocks: (B:7:0x0014, B:19:0x002e, B:19:0x002e, B:21:0x0034, B:21:0x0034, B:24:0x0046, B:24:0x0046, B:43:0x00b5, B:43:0x00b5, B:37:0x0089, B:37:0x0089, B:40:0x0099, B:40:0x0099, B:42:0x00a1, B:42:0x00a1, B:27:0x0051, B:27:0x0051, B:29:0x0059, B:29:0x0059, B:46:0x00c2, B:46:0x00c2, B:16:0x0027, B:16:0x0027), top: B:54:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051 A[Catch: CancellationException | ClosedReceiveChannelException -> 0x00c3, CancellationException | ClosedReceiveChannelException -> 0x00c3, TryCatch #3 {CancellationException | ClosedReceiveChannelException -> 0x00c3, blocks: (B:7:0x0014, B:19:0x002e, B:19:0x002e, B:21:0x0034, B:21:0x0034, B:24:0x0046, B:24:0x0046, B:43:0x00b5, B:43:0x00b5, B:37:0x0089, B:37:0x0089, B:40:0x0099, B:40:0x0099, B:42:0x00a1, B:42:0x00a1, B:27:0x0051, B:27:0x0051, B:29:0x0059, B:29:0x0059, B:46:0x00c2, B:46:0x00c2, B:16:0x0027, B:16:0x0027), top: B:54:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0059 A[Catch: CancellationException | ClosedReceiveChannelException -> 0x00c3, CancellationException | ClosedReceiveChannelException -> 0x00c3, TRY_LEAVE, TryCatch #3 {CancellationException | ClosedReceiveChannelException -> 0x00c3, blocks: (B:7:0x0014, B:19:0x002e, B:19:0x002e, B:21:0x0034, B:21:0x0034, B:24:0x0046, B:24:0x0046, B:43:0x00b5, B:43:0x00b5, B:37:0x0089, B:37:0x0089, B:40:0x0099, B:40:0x0099, B:42:0x00a1, B:42:0x00a1, B:27:0x0051, B:27:0x0051, B:29:0x0059, B:29:0x0059, B:46:0x00c2, B:46:0x00c2, B:16:0x0027, B:16:0x0027), top: B:54:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5 A[Catch: CancellationException | ClosedReceiveChannelException -> 0x00c3, CancellationException | ClosedReceiveChannelException -> 0x00c3, TryCatch #3 {CancellationException | ClosedReceiveChannelException -> 0x00c3, blocks: (B:7:0x0014, B:19:0x002e, B:19:0x002e, B:21:0x0034, B:21:0x0034, B:24:0x0046, B:24:0x0046, B:43:0x00b5, B:43:0x00b5, B:37:0x0089, B:37:0x0089, B:40:0x0099, B:40:0x0099, B:42:0x00a1, B:42:0x00a1, B:27:0x0051, B:27:0x0051, B:29:0x0059, B:29:0x0059, B:46:0x00c2, B:46:0x00c2, B:16:0x0027, B:16:0x0027), top: B:54:0x000c }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00bf -> B:19:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object l(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.h
            gu4 r0 = (defpackage.gu4) r0
            hu4 r1 = defpackage.hu4.a
            int r2 = r13.f
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L2b
            if (r2 == r6) goto L27
            if (r2 == r5) goto L1e
            if (r2 != r4) goto L18
            defpackage.ch3.d0(r14)     // Catch: java.lang.Throwable -> Lc3
            goto L2e
        L18:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r13)
            return r3
        L1e:
            java.lang.Object r2 = r13.g
            defpackage.ch3.d0(r14)     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L87
            goto Lb5
        L25:
            r14 = move-exception
            goto L89
        L27:
            defpackage.ch3.d0(r14)     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            goto L46
        L2b:
            defpackage.ch3.d0(r14)
        L2e:
            boolean r14 = defpackage.cqk.x(r0)     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            if (r14 == 0) goto Lc3
            java.lang.Object r14 = r13.i     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            p41 r14 = (defpackage.p41) r14     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            r13.h = r0     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            r13.g = r3     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            r13.f = r6     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            java.lang.Object r14 = defpackage.p41.J(r14, r13)     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            if (r14 != r1) goto L46
            goto Lc1
        L46:
            java.lang.Object r2 = r13.j     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            as2 r2 = (defpackage.as2) r2     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            java.lang.String r2 = r2.e     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            a4c r7 = defpackage.gm0.f     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            if (r7 != 0) goto L51
            goto L6d
        L51:
            je9 r8 = defpackage.je9.e     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            boolean r9 = r7.b(r8)     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            if (r9 == 0) goto L6d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            r9.<init>()     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            java.lang.String r10 = "while: add "
            r9.append(r10)     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            r9.append(r14)     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            r7.c(r8, r2, r9, r3)     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
        L6d:
            java.lang.Object r2 = r13.j     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L87
            as2 r2 = (defpackage.as2) r2     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L87
            rgi r7 = r2.c     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L87
            java.lang.Object r2 = r2.a     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L87
            r13.h = r0     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L87
            r13.g = r14     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L87
            r13.f = r5     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L87
            java.lang.Object r14 = r7.i(r2, r14, r13)     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L87
            if (r14 != r1) goto Lb5
            goto Lc1
        L82:
            r2 = move-exception
            r12 = r2
            r2 = r14
            r14 = r12
            goto L89
        L87:
            r13 = move-exception
            goto Lc2
        L89:
            java.lang.Object r7 = r13.j     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            as2 r7 = (defpackage.as2) r7     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            java.lang.String r7 = r7.e     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            ru.ok.tamtam.services.ChannelQueueFailReceiveException r8 = new ru.ok.tamtam.services.ChannelQueueFailReceiveException     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            r8.<init>(r2, r14)     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            a4c r14 = defpackage.gm0.f     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            if (r14 != 0) goto L99
            goto Lb5
        L99:
            je9 r9 = defpackage.je9.f     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            boolean r10 = r14.b(r9)     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            if (r10 == 0) goto Lb5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            r10.<init>()     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            java.lang.String r11 = "fail to receive value "
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            r10.append(r2)     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            r14.c(r9, r7, r2, r8)     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
        Lb5:
            r13.h = r0     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            r13.g = r3     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            r13.f = r4     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            java.lang.Object r14 = defpackage.tre.J0(r13)     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
            if (r14 != r1) goto L2e
        Lc1:
            return r1
        Lc2:
            throw r13     // Catch: java.lang.Throwable -> Lc3 java.lang.Throwable -> Lc3
        Lc3:
            sbi r13 = defpackage.sbi.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f00.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0095 A[PHI: r0
  0x0095: PHI (r0v11 java.util.Iterator) = (r0v8 java.util.Iterator), (r0v10 java.util.Iterator), (r0v23 java.util.Iterator) binds: [B:27:0x008a, B:37:0x00dd, B:7:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00dd -> B:28:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object n(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f00.n(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj) {
        pp4 pp4Var;
        x7a x7aVar = (x7a) this.i;
        ChatMediaListWidget chatMediaListWidget = (ChatMediaListWidget) this.h;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            chatMediaListWidget.a = x7aVar;
            pp4 pp4VarF = opl.b(chatMediaListWidget, 1).a().f((View) this.j);
            x43 x43VarO1 = chatMediaListWidget.o1();
            this.g = pp4VarF;
            this.f = 1;
            Serializable serializableI = x43VarO1.I(x7aVar, this);
            hu4 hu4Var = hu4.a;
            if (serializableI == hu4Var) {
                return hu4Var;
            }
            obj = serializableI;
            pp4Var = pp4VarF;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pp4Var = (pp4) this.g;
            ch3.d0(obj);
        }
        pp4Var.l((Collection) obj).build().u(chatMediaListWidget);
        return sbi.a;
    }

    private final Object p(Object obj) {
        Exception exc;
        Exception exc2;
        sfa sfaVar;
        f33 f33Var = (f33) this.h;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            sfa sfaVar2 = (sfa) this.g;
            try {
                l0c l0cVar = (l0c) f33Var.g.getValue();
                try {
                    rt2 rt2Var = (rt2) this.i;
                    try {
                        n11 n11Var = f33Var.d;
                        this.j = sfaVar2;
                        this.f = 1;
                        obj = l0c.l(l0cVar, sfaVar2, rt2Var, n11Var, null, null, this, 56);
                        hu4 hu4Var = hu4.a;
                        if (obj == hu4Var) {
                            return hu4Var;
                        }
                        sfaVar = sfaVar2;
                    } catch (Exception e) {
                        exc2 = e;
                        sfaVar = sfaVar2;
                        ((t1c) ((ed6) f33Var.h.getValue())).a(new RuntimeException("Error during mapping message=" + sfaVar, exc2));
                        return null;
                    }
                } catch (Exception e2) {
                    exc = e2;
                    exc2 = exc;
                    sfaVar = sfaVar2;
                    ((t1c) ((ed6) f33Var.h.getValue())).a(new RuntimeException("Error during mapping message=" + sfaVar, exc2));
                    return null;
                }
            } catch (Exception e3) {
                exc = e3;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sfaVar = (sfa) this.j;
            try {
                ch3.d0(obj);
            } catch (Exception e4) {
                exc2 = e4;
                ((t1c) ((ed6) f33Var.h.getValue())).a(new RuntimeException("Error during mapping message=" + sfaVar, exc2));
                return null;
            }
        }
        return (MessageModel) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r0.emit(r7, r6) == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object q(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.g
            yx6 r0 = (defpackage.yx6) r0
            int r1 = r6.f
            r2 = 2
            r3 = 1
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            defpackage.ch3.d0(r7)
            goto L52
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r4
        L1b:
            java.lang.Object r0 = r6.h
            yx6 r0 = (defpackage.yx6) r0
            defpackage.ch3.d0(r7)
            goto L45
        L23:
            defpackage.ch3.d0(r7)
            java.lang.Object r7 = r6.i
            c30 r7 = (defpackage.c30) r7
            java.lang.Object r7 = r7.i
            ny8 r7 = (defpackage.ny8) r7
            java.lang.Object r7 = r7.getValue()
            pvb r7 = (defpackage.pvb) r7
            java.lang.Object r1 = r6.j
            wy2 r1 = (defpackage.wy2) r1
            r6.g = r4
            r6.h = r0
            r6.f = r3
            java.lang.Object r7 = r7.D(r1, r6)
            if (r7 != r5) goto L45
            goto L51
        L45:
            r6.g = r4
            r6.h = r4
            r6.f = r2
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r5) goto L52
        L51:
            return r5
        L52:
            sbi r6 = defpackage.sbi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f00.q(java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj) {
        fda fdaVarB;
        ic6 ic6Var;
        x7a x7aVar = (x7a) this.j;
        x43 x43Var = (x43) this.i;
        int i = this.f;
        sbi sbiVar = sbi.a;
        if (i == 0) {
            ch3.d0(obj);
            zv8[] zv8VarArr = x43.q1;
            rt2 rt2VarG = x43Var.G();
            if (rt2VarG == null || (fdaVarB = x43.B(x43Var, x7aVar.l())) == null) {
                return sbiVar;
            }
            ic6 ic6Var2 = x43Var.K;
            r13 r13Var = (r13) x43Var.H.getValue();
            this.g = x43Var;
            this.h = ic6Var2;
            this.f = 1;
            obj = r13Var.b(rt2VarG, fdaVarB, x7aVar, this);
            hu4 hu4Var = hu4.a;
            if (obj == hu4Var) {
                return hu4Var;
            }
            ic6Var = ic6Var2;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ic6Var = (ic6) this.h;
            x43Var = (x43) this.g;
            ch3.d0(obj);
        }
        zv8[] zv8VarArr2 = x43.q1;
        x43Var.getClass();
        a8j.x(ic6Var, obj);
        return sbiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        if (r0 == r7) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object s(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f00.s(java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj) {
        yx6 yx6Var = (yx6) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            jz jzVar = (jz) this.h;
            fa3 fa3Var = new fa3(yx6Var, (ga3) this.i, (ny8) this.j, 0);
            this.g = null;
            this.f = 1;
            Object objCollect = jzVar.collect(fa3Var, this);
            hu4 hu4Var = hu4.a;
            if (objCollect == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r9 == r3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (r9 == r3) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object u(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.i
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.lang.Object r1 = r8.h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.g
            wf3 r2 = (defpackage.wf3) r2
            int r3 = r8.f
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L25
            if (r3 == r6) goto L21
            if (r3 != r5) goto L1b
            defpackage.ch3.d0(r9)
            goto L6f
        L1b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            return r4
        L21:
            defpackage.ch3.d0(r9)
            goto L5b
        L25:
            defpackage.ch3.d0(r9)
            ny8 r9 = r2.o
            java.lang.Object r9 = r9.getValue()
            e5d r9 = (defpackage.e5d) r9
            b5d r9 = r9.i6
            zv8[] r3 = defpackage.e5d.S6
            r7 = 374(0x176, float:5.24E-43)
            r3 = r3[r7]
            i5d r9 = r9.a(r3)
            java.lang.Object r9 = r9.i()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            hu4 r3 = defpackage.hu4.a
            if (r9 == 0) goto L66
            ny8 r9 = r2.n
            java.lang.Object r9 = r9.getValue()
            xw4 r9 = (defpackage.xw4) r9
            r8.f = r6
            java.io.Serializable r9 = r9.a(r1, r0, r8)
            if (r9 != r3) goto L5b
            goto L6e
        L5b:
            java.io.File r9 = (java.io.File) r9
            if (r9 == 0) goto L64
            java.lang.String r9 = r9.getAbsolutePath()
            goto L71
        L64:
            r9 = r4
            goto L71
        L66:
            r8.f = r5
            java.io.Serializable r9 = defpackage.wf3.B(r2, r1, r0, r8)
            if (r9 != r3) goto L6f
        L6e:
            return r3
        L6f:
            java.lang.String r9 = (java.lang.String) r9
        L71:
            mjg r0 = r2.p
            tf3 r2 = new tf3
            java.lang.Object r8 = r8.j
            android.graphics.RectF r8 = (android.graphics.RectF) r8
            r2.<init>(r1, r9, r8)
            r0.getClass()
            r0.j(r4, r2)
            sbi r8 = defpackage.sbi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f00.u(java.lang.Object):java.lang.Object");
    }

    private final Object v(Object obj) {
        yx6 yx6Var = (yx6) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            sfe sfeVar = new sfe();
            xx6 xx6Var = (xx6) this.h;
            ck3 ck3Var = new ck3(sfeVar, yx6Var, (s9e) this.i, (fk3) this.j, 0);
            this.g = null;
            this.f = 1;
            Object objCollect = xx6Var.collect(ck3Var, this);
            hu4 hu4Var = hu4.a;
            if (objCollect == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    private final Object w(Object obj) {
        vg4 vg4VarW;
        rt2 rt2Var;
        boolean zBooleanValue;
        ic6 ic6Var;
        fk3 fk3Var = (fk3) this.i;
        int i = this.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            zv8[] zv8VarArr = fk3.y1;
            r8e r8eVarK = fk3Var.E().k(((be3) this.j).c);
            this.f = 1;
            obj = e9i.N(r8eVarK, this);
            if (obj != hu4Var) {
            }
            return hu4Var;
        }
        if (i == 1) {
            ch3.d0(obj);
        } else {
            if (i != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vg4VarW = (vg4) this.h;
            rt2Var = (rt2) this.g;
            ch3.d0(obj);
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        ic6Var = fk3Var.J;
        if (zBooleanValue) {
            a8j.x(ic6Var, zm3.z(zm3.b, vg4VarW.v(), bdj.SEARCH_BUTTON, null, null, 28));
            return sbiVar;
        }
        a8j.x(ic6Var, zm3.k(zm3.b, rt2Var.a, null, null, 14));
        return sbiVar;
        rt2 rt2Var2 = (rt2) obj;
        vg4VarW = rt2Var2 != null ? rt2Var2.w() : null;
        if (rt2Var2 == null || vg4VarW == null || !vg4VarW.E()) {
            a8j.x(fk3Var.K, new r3g(new tnh(R.string.chat_list_bot_cannot_open_web_app), null, null, 6));
            return sbiVar;
        }
        rp3 rp3Var = (rp3) fk3Var.D.getValue();
        long jV = vg4VarW.v();
        this.g = rt2Var2;
        this.h = vg4VarW;
        this.f = 2;
        Object objA = rp3Var.a(jV, this);
        if (objA != hu4Var) {
            obj = objA;
            rt2Var = rt2Var2;
            zBooleanValue = ((Boolean) obj).booleanValue();
            ic6Var = fk3Var.J;
            if (zBooleanValue) {
                a8j.x(ic6Var, zm3.k(zm3.b, rt2Var.a, null, null, 14));
                return sbiVar;
            }
            a8j.x(ic6Var, zm3.z(zm3.b, vg4VarW.v(), bdj.SEARCH_BUTTON, null, null, 28));
            return sbiVar;
        }
        return hu4Var;
    }

    private final Object x(Object obj) {
        fk3 fk3Var;
        Set set = (Set) this.g;
        int i = this.f;
        try {
            if (i == 0) {
                ch3.d0(obj);
                ny8 ny8Var = (ny8) this.i;
                fk3 fk3Var2 = (fk3) this.j;
                try {
                    yfd yfdVar = (yfd) ny8Var.getValue();
                    this.g = null;
                    this.h = fk3Var2;
                    this.f = 1;
                    Object objG = yfdVar.G(set, this);
                    hu4 hu4Var = hu4.a;
                    if (objG == hu4Var) {
                        return hu4Var;
                    }
                } catch (Throwable th) {
                    th = th;
                    fk3Var = fk3Var2;
                    gm0.V(fk3Var.Z, "fail to prefetch presences", th);
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fk3Var = (fk3) this.h;
                try {
                    ch3.d0(obj);
                } catch (Throwable th2) {
                    th = th2;
                    gm0.V(fk3Var.Z, "fail to prefetch presences", th);
                }
            }
            return sbi.a;
        } catch (CancellationException e) {
            throw e;
        }
    }

    private final Object y(Object obj) {
        tw2 tw2Var = (tw2) this.g;
        ch3.d0(obj);
        vw2 vw2VarA = ((ww2) this.h).a();
        vw2VarA.c = this.f;
        Set set = (Set) this.j;
        ww2 ww2VarA = vw2VarA.a();
        if (cqk.d(w50.u, set)) {
            tw2Var.q = ww2VarA;
        } else if (cqk.d(w50.v, set)) {
            tw2Var.r = ww2VarA;
        } else if (cqk.d(w50.w, set)) {
            tw2Var.s = ww2VarA;
        } else if (cqk.d(w50.x, set)) {
            tw2Var.t = ww2VarA;
        } else if (cqk.d(w50.y, set)) {
            tw2Var.u = ww2VarA;
        } else if (cqk.d(w50.z, set)) {
            tw2Var.v = ww2VarA;
        } else if (cqk.d(w50.A, set)) {
            tw2Var.w = ww2VarA;
        } else if (cqk.d(w50.B, set)) {
            tw2Var.x = ww2VarA;
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x0117  */
    /* JADX WARN: Code duplicated, block: B:62:0x0146  */
    /* JADX WARN: Code duplicated, block: B:63:0x0147  */
    /* JADX WARN: Code duplicated, block: B:75:0x0186  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0161, code lost:
    
        if (r0.y(r1, r23) == r7) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object z(java.lang.Object r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f00.z(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                return new f00(this.g, lq4Var, (h00) this.h, (s04) obj2, 0);
            case 1:
                f00 f00Var = new f00((qf7) obj2, (kfc) this.j, lq4Var, 1);
                f00Var.g = obj;
                return f00Var;
            case 2:
                return new f00(2, lq4Var, (zt6) this.g, (wfi) this.h, (sgg) obj2, (wo8) this.j);
            case 3:
                f00 f00Var2 = new f00((khc) obj2, (AudioRecord) this.j, lq4Var, 3);
                f00Var2.g = obj;
                return f00Var2;
            case 4:
                f00 f00Var3 = new f00((r00) obj2, (wy2) this.j, lq4Var, 4);
                f00Var3.g = obj;
                return f00Var3;
            case 5:
                f00 f00Var4 = new f00((c30) obj2, (wy2) this.j, lq4Var, 5);
                f00Var4.g = obj;
                return f00Var4;
            case 6:
                return new f00((ny8) this.h, (bw0) obj2, (ny8) this.j, lq4Var, 6);
            case 7:
                return new f00(7, lq4Var, (hs1) this.g, (String) this.h, (dz4) obj2, (be1) this.j);
            case 8:
                return new f00((y92) this.h, (sv1) obj2, (qv5) this.j, lq4Var, 8);
            case 9:
                return new f00((y92) obj2, (sv1) this.j, lq4Var, 9);
            case 10:
                return new f00(lq4Var, (pm2) this.g, (ArrayList) this.h, (ArrayList) obj2);
            case 11:
                f00 f00Var5 = new f00((p41) obj2, (as2) this.j, lq4Var, 11);
                f00Var5.h = obj;
                return f00Var5;
            case 12:
                return new f00(this.g, lq4Var, (gu2) this.h, (rt2) obj2, (List) this.j);
            case 13:
                return new f00((m8b) obj2, (yy2) this.j, lq4Var, 13);
            case 14:
                return new f00(14, lq4Var, (qw2) this.g, (List) this.h, (String) obj2, (String) this.j);
            case 15:
                return new f00((ChatMediaListWidget) this.h, (x7a) obj2, (View) this.j, lq4Var, 15);
            case 16:
                return new f00(this.g, lq4Var, (f33) this.h, (rt2) obj2, 16);
            case 17:
                f00 f00Var6 = new f00((c30) obj2, (wy2) this.j, lq4Var, 17);
                f00Var6.g = obj;
                return f00Var6;
            case 18:
                return new f00((x43) obj2, (x7a) this.j, lq4Var, 18);
            case 19:
                return new f00((o73) this.h, (gda) obj2, (tja) this.j, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                f00 f00Var7 = new f00((jz) this.h, lq4Var, (ga3) obj2, (ny8) this.j, 20);
                f00Var7.g = obj;
                return f00Var7;
            case 21:
                return new f00(21, lq4Var, (wf3) this.g, (String) this.h, (Rect) obj2, (RectF) this.j);
            case 22:
                f00 f00Var8 = new f00((xx6) this.h, lq4Var, (s9e) obj2, (fk3) this.j, 22);
                f00Var8.g = obj;
                return f00Var8;
            case 23:
                return new f00((fk3) obj2, (be3) this.j, lq4Var, 23);
            case 24:
                f00 f00Var9 = new f00((ny8) obj2, (fk3) this.j, lq4Var, 24);
                f00Var9.g = obj;
                return f00Var9;
            case 25:
                f00 f00Var10 = new f00((ww2) this.h, this.f, (xn3) obj2, (Set) this.j, lq4Var);
                f00Var10.g = obj;
                return f00Var10;
            case 26:
                return new f00((mz3) this.h, (s4b) obj2, lq4Var);
            case 27:
                f00 f00Var11 = new f00((f64) this.h, (Long) obj2, (long[]) this.j, lq4Var, 27);
                f00Var11.g = obj;
                return f00Var11;
            case 28:
                return new f00((qb4) obj2, (String) this.j, lq4Var, 28);
            default:
                f00 f00Var12 = new f00((jz) this.h, lq4Var, (vi4) obj2, (ny8) this.j, 29);
                f00Var12.g = obj;
                return f00Var12;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((f00) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((f00) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((f00) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((f00) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((f00) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((f00) create((Set) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                ((f00) create((tw2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 26:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((f00) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((f00) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:199:0x0362  */
    /* JADX WARN: Code duplicated, block: B:202:0x0370  */
    /* JADX WARN: Code duplicated, block: B:208:0x0381  */
    /* JADX WARN: Code duplicated, block: B:209:0x0383  */
    /* JADX WARN: Code duplicated, block: B:211:0x038d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:212:0x038f  */
    /* JADX WARN: Code duplicated, block: B:214:0x0393  */
    /* JADX WARN: Code duplicated, block: B:215:0x0396  */
    /* JADX WARN: Code duplicated, block: B:289:0x04de  */
    /* JADX WARN: Code duplicated, block: B:290:0x04df A[Catch: TamErrorException -> 0x0486, TryCatch #3 {TamErrorException -> 0x0486, blocks: (B:273:0x0482, B:287:0x04d4, B:290:0x04df, B:292:0x04e7), top: B:446:0x0482 }] */
    /* JADX WARN: Code duplicated, block: B:292:0x04e7 A[Catch: TamErrorException -> 0x0486, TRY_LEAVE, TryCatch #3 {TamErrorException -> 0x0486, blocks: (B:273:0x0482, B:287:0x04d4, B:290:0x04df, B:292:0x04e7), top: B:446:0x0482 }] */
    /* JADX WARN: Code duplicated, block: B:299:0x0515  */
    /* JADX WARN: Code duplicated, block: B:301:0x051d  */
    /* JADX WARN: Code duplicated, block: B:415:0x0833  */
    /* JADX WARN: Code duplicated, block: B:417:0x083b  */
    /* JADX WARN: Code duplicated, block: B:473:0x037c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d3, code lost:
    
        if (r0 == r12) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02d8, code lost:
    
        if (r0 == r12) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0314, code lost:
    
        if (defpackage.y92.b(r2, r3, r28) == r12) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0336, code lost:
    
        if (r0 == r12) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03ac, code lost:
    
        if (r0.c(r2, r1, r28) == r12) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0404, code lost:
    
        if (r0 == r2) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x043d, code lost:
    
        if (r0.c(r3, r4, r28) == r2) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0440, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x057b, code lost:
    
        if (r0.emit(r2, r28) == r1) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x05ca, code lost:
    
        if (r0.emit(r2, r28) == r1) goto L331;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:292:0x04e7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:417:0x083b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 2330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f00.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f00(int i, lq4 lq4Var, Object obj, Object obj2, Object obj3, Object obj4) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f00(mz3 mz3Var, s4b s4bVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 26;
        this.h = mz3Var;
        this.i = s4bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f00(lq4 lq4Var, pm2 pm2Var, ArrayList arrayList, ArrayList arrayList2) {
        super(2, lq4Var);
        this.e = 10;
        this.g = pm2Var;
        this.h = arrayList;
        this.i = arrayList2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f00(xx6 xx6Var, lq4 lq4Var, Object obj, Object obj2, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = xx6Var;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f00(Object obj, lq4 lq4Var, s00 s00Var, rt2 rt2Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = s00Var;
        this.i = rt2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f00(Object obj, lq4 lq4Var, gu2 gu2Var, rt2 rt2Var, List list) {
        super(2, lq4Var);
        this.e = 12;
        this.g = obj;
        this.h = gu2Var;
        this.i = rt2Var;
        this.j = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f00(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f00(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
    }
}
