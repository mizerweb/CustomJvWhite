package defpackage;

import ru.ok.tamtam.android.util.share.ShareData;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class v63 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public v63(int i) {
        switch (i) {
            case 1:
                this.a = rx8.P(3, new irf(3));
                this.b = rx8.P(3, new irf(4));
                this.c = rx8.P(3, new irf(5));
                this.d = rx8.P(3, new irf(6));
                break;
            default:
                this.a = rx8.P(3, new k82(19));
                this.b = rx8.P(3, new k82(20));
                this.c = rx8.P(3, new k82(21));
                this.d = rx8.P(3, new k82(22));
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(ShareData shareData, nq4 nq4Var) {
        myf myfVar;
        if (nq4Var instanceof myf) {
            myfVar = (myf) nq4Var;
            int i = myfVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                myfVar.f = i - Integer.MIN_VALUE;
            } else {
                myfVar = new myf(this, nq4Var);
            }
        } else {
            myfVar = new myf(this, nq4Var);
        }
        Object objN = myfVar.d;
        int i2 = myfVar.f;
        if (i2 == 0) {
            ch3.d0(objN);
            String str = shareData.text;
            if (str == null) {
                return new txf(new tnh(R.string.share_sticker_set_title), ynh.b, new Integer(R.drawable.sticker_placeholder));
            }
            ((w69) this.d.getValue()).getClass();
            long jE = w69.e(str);
            if (jE == 0) {
                return new txf(new tnh(R.string.share_sticker_set_title), new xnh(str), new Integer(R.drawable.sticker_placeholder));
            }
            xx6 xx6VarA = ((ceh) this.c.getValue()).a(jE, false);
            myfVar.f = 1;
            objN = e9i.N(xx6VarA, myfVar);
            hu4 hu4Var = hu4.a;
            if (objN == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objN);
        }
        emg emgVar = (emg) objN;
        tnh tnhVar = new tnh(R.string.share_sticker_set_title);
        String str2 = emgVar != null ? emgVar.b : null;
        if (str2 == null) {
            str2 = "";
        }
        return new txf(tnhVar, new xnh(str2), emgVar != null ? emgVar.c : null, null, new Integer(R.drawable.sticker_placeholder));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008c -> B:23:0x0091). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object b(defpackage.ynh r19, ru.ok.tamtam.android.util.share.ShareData r20, defpackage.nq4 r21) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v63.b(ynh, ru.ok.tamtam.android.util.share.ShareData, nq4):java.lang.Object");
    }

    public v63(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
    }
}
