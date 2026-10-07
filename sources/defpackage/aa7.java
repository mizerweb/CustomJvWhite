package defpackage;

import android.content.Context;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import one.video.transloader.TranscodingUploader;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aa7 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ aa7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                aec aecVar = (aec) obj4;
                wdc wdcVar = (wdc) obj3;
                p4d p4dVar = (p4d) obj2;
                p4d p4dVar2 = (p4d) obj;
                Iterator it = ((ga7) obj5).b.iterator();
                while (it.hasNext()) {
                    ((xdc) it.next()).i(wdcVar, aecVar, p4dVar, p4dVar2);
                }
                return sbiVar;
            case 1:
                jsa jsaVar = (jsa) obj5;
                ny8 ny8Var = (ny8) obj4;
                ny8 ny8Var2 = (ny8) obj3;
                ny8 ny8Var3 = (ny8) obj2;
                ny8 ny8Var4 = (ny8) obj;
                boolean zQ0 = jsaVar.q0();
                r8e r8eVar = jsaVar.w2;
                return zQ0 ? new tka(r8eVar, ny8Var, ny8Var2, ny8Var3, (wmi) jsaVar.H1.getValue()) : new qka(r8eVar, jsaVar.j, ny8Var, ny8Var2, ny8Var3, ny8Var4);
            case 2:
                TranscodingUploader transcodingUploader = (TranscodingUploader) obj3;
                RandomAccessFile randomAccessFile = (RandomAccessFile) obj2;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                ((sfe) obj5).a = true;
                if (((AtomicBoolean) obj4).get()) {
                    transcodingUploader.a(randomAccessFile, atomicBoolean);
                }
                return sbiVar;
            default:
                ioj iojVar = (ioj) obj5;
                return new rej(((s7f) iojVar.j).t(), iojVar.c, iojVar.b, (Context) ((ny8) obj4).getValue(), new r8e(iojVar.n1), iojVar.k, (ny8) obj3, (ny8) obj2, (ny8) obj);
        }
    }
}
