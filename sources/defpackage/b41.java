package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class b41 implements Closeable {
    public final AsynchronousFileChannel a;
    public final o31 b;
    public final dq4 c;
    public final String d = b41.class.getName();
    public final p41 e;
    public final p41 f;
    public sgg g;

    public b41(AsynchronousFileChannel asynchronousFileChannel, o31 o31Var, dq4 dq4Var) {
        this.a = asynchronousFileChannel;
        this.b = o31Var;
        this.c = dq4Var;
        final int i = 0;
        this.e = yab.b(Integer.MAX_VALUE, 0, new cf7(this) { // from class: z31
            public final /* synthetic */ b41 b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i2 = i;
                sbi sbiVar = sbi.a;
                b41 b41Var = this.b;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                switch (i2) {
                    case 0:
                        b41Var.b.b(byteBuffer);
                        break;
                    default:
                        b41Var.b.b(byteBuffer);
                        break;
                }
                return sbiVar;
            }
        }, 2);
        final int i2 = 1;
        this.f = yab.b(Integer.MAX_VALUE, 0, new cf7(this) { // from class: z31
            public final /* synthetic */ b41 b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i3 = i2;
                sbi sbiVar = sbi.a;
                b41 b41Var = this.b;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                switch (i3) {
                    case 0:
                        b41Var.b.b(byteBuffer);
                        break;
                    default:
                        b41Var.b.b(byteBuffer);
                        break;
                }
                return sbiVar;
            }
        }, 2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0102  */
    /* JADX WARN: Code duplicated, block: B:54:0x011b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x011b -> B:55:0x0120). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(defpackage.b41 r25, long r26, long r28, defpackage.nq4 r30) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b41.b(b41, long, long, nq4):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IllegalAccessException, IOException, InvocationTargetException {
        String str = this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Reader is closed completely", null);
            }
        }
        sgg sggVar = this.g;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.g = null;
        this.a.close();
        this.e.b(null);
        this.f.b(null);
    }

    public final void g(ByteBuffer byteBuffer) {
        String str = this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Return buffer to pool", null);
            }
        }
        if (this.e.c(byteBuffer) instanceof cs2) {
            this.b.b(byteBuffer);
        }
    }

    public final void l(long j, long j2) throws IllegalAccessException, IOException, InvocationTargetException {
        int iMin;
        je9 je9Var = je9.d;
        if (j2 <= 0) {
            String str = this.d;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, c0a.m(j2, " - instantly close reader", qt4.s(j, "Trying to start reading from offset = ", " with limit = ")), null);
            }
            close();
            return;
        }
        sgg sggVar = this.g;
        int i = 1;
        if (sggVar != null && sggVar.isActive()) {
            String str2 = this.d;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, c0a.m(j2, " while read is already active", qt4.s(j, "Trying to start reading from offset = ", " with limit = ")), null);
                return;
            }
            return;
        }
        long j3 = j2 - j;
        if (j3 <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            iMin = (int) j3;
        } else {
            iMin = (int) (Math.min(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, j3) / 2);
            i = 2;
        }
        String str3 = this.d;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            StringBuilder sbS = qt4.s(j, "Start reading from offset = ", " with limit = ");
            c0a.w(sbS, j2, ". Each buffer size = ", iMin);
            sbS.append(", number of buffers = ");
            sbS.append(i);
            sbS.append(", total buffered size = ");
            sbS.append(iMin * i);
            a4cVar3.c(je9Var, str3, sbS.toString(), null);
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.e.c(this.b.a(iMin));
        }
        this.g = yab.i0(this.c, null, 0, new ag0(this, j, j2, null, 1), 3);
    }
}
