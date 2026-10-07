package defpackage;

import android.media.MediaCodec;
import androidx.media3.muxer.MuxerException;
import java.nio.ByteBuffer;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tp9 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tp9(jrc jrcVar, int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.a = 0;
        this.c = jrcVar;
        this.b = i;
        this.d = byteBuffer;
        this.e = bufferInfo;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        Object obj = this.e;
        int i3 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj2;
                MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) obj;
                lh6 lh6Var = (lh6) ((jrc) obj3).d;
                lvb.b0(lh6Var.b);
                try {
                    s2b s2bVar = (s2b) lh6Var.e;
                    bufferInfo.getClass();
                    long j = bufferInfo.presentationTimeUs;
                    int i4 = bufferInfo.size;
                    int i5 = bufferInfo.flags;
                    String str = vqi.a;
                    if ((i5 & 1) != 1) {
                        i2 = 0;
                    }
                    if ((i5 & 4) == 4) {
                        i2 |= 4;
                    }
                    s2bVar.w0(i3, byteBuffer, new u31(i4, i2, j));
                    return sbi.a;
                } catch (MuxerException e) {
                    qr7.o(e);
                    return null;
                }
            case 1:
                py1 py1Var = (py1) obj3;
                Widget widget = (Widget) obj2;
                af7 af7Var = (af7) obj;
                wfe wfeVar = new wfe();
                CharSequence charSequenceB = py1Var.G.b(widget.getContext());
                if (charSequenceB == null) {
                    charSequenceB = "";
                }
                ynh ynhVar = py1Var.H;
                CharSequence charSequenceB2 = ynhVar != null ? ynhVar.b(widget.getContext()) : null;
                Integer num = py1Var.I;
                s3g s3gVar = new s3g(wfeVar, af7Var, 0);
                h8c h8cVar = new h8c(widget);
                h8cVar.n(charSequenceB);
                if (charSequenceB2 != null) {
                    h8cVar.b(charSequenceB2);
                }
                if (num != null) {
                    h8cVar.h(new w8c(num.intValue()));
                }
                h8cVar.e(new y42(4, s3gVar));
                h8cVar.c(new o8c(0, 0, i3, 11));
                g8c g8cVarP = h8cVar.p();
                wfeVar.a = g8cVarP;
                return g8cVarP;
            default:
                qy1 qy1Var = (qy1) obj2;
                wfe wfeVar2 = new wfe();
                vnh vnhVar = qy1Var.F;
                wre wreVar = qy1Var.G;
                s3g s3gVar2 = new s3g(wfeVar2, (af7) obj, 1);
                h8c h8cVar2 = new h8c((Widget) obj3);
                h8cVar2.m(vnhVar);
                h8cVar2.h(z8c.a);
                h8cVar2.j(b9c.a);
                h8cVar2.e(new c5f(s3gVar2, 3, wreVar));
                h8cVar2.c(new o8c(0, 0, i3, 11));
                g8c g8cVarP2 = h8cVar2.p();
                wfeVar2.a = g8cVarP2;
                return g8cVarP2;
        }
    }

    public /* synthetic */ tp9(Object obj, Object obj2, int i, af7 af7Var, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = af7Var;
    }
}
