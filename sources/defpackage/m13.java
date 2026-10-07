package defpackage;

import android.media.MediaPlayer;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class m13 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public /* synthetic */ float f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m13(m7g m7gVar, float f, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = m7gVar;
        this.f = f;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                m13 m13Var = new m13((n13) obj2, lq4Var);
                m13Var.f = ((Number) obj).floatValue();
                return m13Var;
            default:
                return new m13((m7g) obj2, this.f, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((m13) create(Float.valueOf(((Number) obj).floatValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((m13) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        a4c a4cVar;
        switch (this.e) {
            case 0:
                float f = this.f;
                ch3.d0(obj);
                ((n13) this.g).u.setProgress(f * 100.0f);
                return sbi.a;
            default:
                sbi sbiVar = sbi.a;
                ch3.d0(obj);
                m7g m7gVar = (m7g) this.g;
                float f2 = this.f;
                try {
                    MediaPlayer mediaPlayer = m7gVar.d;
                    if (mediaPlayer != null) {
                        mediaPlayer.setVolume(f2, f2);
                        poeVar = sbiVar;
                    } else {
                        poeVar = null;
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null && (a4cVar = gm0.f) != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "SimpleRingtonePlayer", "setVolume was failed", thA);
                    }
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m13(n13 n13Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = n13Var;
    }
}
