package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class szi extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szi(xzi xziVar, Uri uri, vfe vfeVar, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.g = xziVar;
        this.h = uri;
        this.i = vfeVar;
        this.f = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                return new szi((xzi) this.g, (Uri) obj3, (vfe) obj2, this.f, lq4Var);
            case 1:
                szi sziVar = new szi((f99) obj3, (i13) obj2, this.f, lq4Var);
                sziVar.g = obj;
                return sziVar;
            case 2:
                szi sziVar2 = new szi((h1c) obj3, this.f, (xn3) obj2, lq4Var, 2);
                sziVar2.g = obj;
                return sziVar2;
            default:
                szi sziVar3 = new szi((sfa) obj3, this.f, (js8) obj2, lq4Var, 3);
                sziVar3.g = obj;
                return sziVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((szi) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                ((szi) create((tw2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((szi) create((tw2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                ((szi) create((tw2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IOException {
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource((Context) ((xzi) this.g).b.getValue(), (Uri) this.h);
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(TimeUnit.MILLISECONDS.toMicros(((vfe) this.i).a), 2);
                    if (frameAtTime != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            frameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                            frameAtTime.recycle();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            mediaMetadataRetriever.release();
                            return byteArray;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                rx8.n(byteArrayOutputStream, th);
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        String str = ((xzi) this.g).f;
                        nzi nziVar = new nzi(th3);
                        Uri uri = (Uri) this.h;
                        long j = this.f;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "getPreviewAtPositionMs failed for uri=" + uri + " positionMs=" + j, nziVar);
                            }
                            break;
                        }
                    } finally {
                        mediaMetadataRetriever.release();
                    }
                }
                return null;
            case 1:
                je9 je9Var2 = je9.d;
                tw2 tw2Var = (tw2) this.g;
                ch3.d0(obj);
                long j2 = tw2Var.u0;
                f99 f99Var = (f99) this.h;
                if (j2 > f99Var.b) {
                    String str2 = ((i13) this.i).g;
                    long j3 = this.f;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                        long j4 = f99Var.b;
                        StringBuilder sb = new StringBuilder("skip livestream update: chatId = ");
                        sb.append(j3);
                        sb.append(": ");
                        sb.append(tw2Var);
                        a4cVar2.c(je9Var2, str2, qt4.k(j4, ".liveStreamUpdateTime > ", sb), null);
                    }
                } else {
                    l40 l40Var = f99Var.c;
                    b50 b50Var = new b50(1);
                    b50Var.add(l40Var);
                    c46 c46VarE = pm9.e(b50Var, (m7f) ((i13) this.i).l.getValue());
                    if (c46VarE.i() != 1) {
                        String str3 = ((i13) this.i).g;
                        long j5 = this.f;
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null) {
                            je9 je9Var3 = je9.f;
                            if (a4cVar3.b(je9Var3)) {
                                a4cVar3.c(je9Var3, str3, zo5.g(c46VarE.i(), j5, "unexpected attaches mapping size: chatId = ", ": attaches = "), null);
                            }
                        }
                    } else {
                        long j6 = ((f99) this.h).b;
                        tw2Var.v0 = new gj2(j6, c46VarE.h(0), 1);
                        String str4 = ((i13) this.i).g;
                        long j7 = this.f;
                        a4c a4cVar4 = gm0.f;
                        if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                            StringBuilder sbS = qt4.s(j7, "\n                                updated liveStream: chatId = ", ", \n                                liveStream time = ");
                            sbS.append(j6);
                            sbS.append(", \n                            ");
                            a4cVar4.c(je9Var2, str4, s5h.x0(sbS.toString()), null);
                        }
                    }
                }
                return sbi.a;
            case 2:
                tw2 tw2Var2 = (tw2) this.g;
                ch3.d0(obj);
                tw2Var2.e0 = (h1c) this.h;
                tw2Var2.f0 = this.f;
                tw2Var2.g0 = ((xn3) this.i).b.getAsLong();
                return sbi.a;
            default:
                tw2 tw2Var3 = (tw2) this.g;
                ch3.d0(obj);
                sb8.R(tw2Var3.n, ((sfa) this.h).c, mg5.REGULAR);
                long j8 = this.f;
                tw2Var3.y = j8;
                String str5 = (String) ((qg7) ((js8) this.i).b).b;
                a4c a4cVar5 = gm0.f;
                if (a4cVar5 != null) {
                    je9 je9Var4 = je9.d;
                    if (a4cVar5.b(je9Var4)) {
                        a4cVar5.c(je9Var4, str5, zo5.j(j8, "set first message id = "), null);
                    }
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szi(f99 f99Var, i13 i13Var, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 1;
        this.h = f99Var;
        this.i = i13Var;
        this.f = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ szi(Object obj, long j, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.f = j;
        this.i = obj2;
    }
}
