package defpackage;

import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ldl8;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "isForce", "", "curVersion", "forceVersion", "", "cause", "<init>", "(ZIILjava/lang/Throwable;)V", "oneme"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class dl8 extends IssueKeyException {
    /* JADX WARN: Illegal instructions before constructor call */
    public dl8(boolean z, int i, int i2, Throwable th) {
        StringBuilder sbB = zo5.B("WARNING! Call invalidate db,\n            |isSuccess=", th == null, ",\n            |Force info, wasForce:", z, ", curForceVer:");
        sbB.append(i);
        sbB.append(", forceVerFromConf:");
        sbB.append(i2);
        sbB.append("\n            |");
        super("ONEME-36437", s5h.y0(sbB.toString()), th);
    }

    public /* synthetic */ dl8(boolean z, int i, int i2, Throwable th, int i3, j95 j95Var) {
        this(z, i, i2, (i3 & 8) != 0 ? null : th);
    }
}
