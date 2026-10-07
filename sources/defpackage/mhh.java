package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes2.dex */
public final class mhh extends mdh implements qf7 {
    public Closeable e;
    public h6f f;
    public FileChannel g;
    public wfe h;
    public ByteBuffer i;
    public int j;
    public int k;
    public int l;
    public long m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ h6f p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhh(h6f h6fVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.p = h6fVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        mhh mhhVar = new mhh(this.p, lq4Var);
        mhhVar.o = obj;
        return mhhVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((mhh) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f3 A[Catch: all -> 0x015a, TryCatch #5 {all -> 0x015a, blocks: (B:36:0x00f3, B:43:0x0113, B:44:0x0126, B:47:0x0135, B:54:0x015d, B:30:0x00a7, B:34:0x00b8, B:55:0x018f, B:57:0x019d, B:58:0x01a4, B:61:0x01b5, B:22:0x0086, B:27:0x0096), top: B:84:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0106  */
    /* JADX WARN: Code duplicated, block: B:49:0x0153  */
    /* JADX WARN: Code duplicated, block: B:50:0x0155  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x010b -> B:42:0x010e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0155 -> B:51:0x0156). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
