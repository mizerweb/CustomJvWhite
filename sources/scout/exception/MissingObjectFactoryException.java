package scout.exception;

import defpackage.c54;
import defpackage.hg5;
import defpackage.r3f;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lscout/exception/MissingObjectFactoryException;", "Lscout/exception/ScoutException;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MissingObjectFactoryException extends ScoutException {
    public final int a;
    public final r3f b;

    public MissingObjectFactoryException(int i, r3f r3fVar) {
        this.a = i;
        this.b = r3fVar;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0027  */
    @Override // java.lang.Throwable
    public final String getMessage() {
        Object objValueOf;
        StringBuilder sb = new StringBuilder("Missing factory for ");
        StringBuilder sb2 = new StringBuilder("Object(type=");
        c54 c54VarA = hg5.a();
        int i = this.a;
        if (c54VarA != null) {
            c54VarA.a();
            objValueOf = (String) c54VarA.b.get(Integer.valueOf(i));
            if (objValueOf == null) {
                objValueOf = Integer.valueOf(i);
            }
        } else {
            objValueOf = Integer.valueOf(i);
        }
        sb2.append(objValueOf);
        sb2.append(')');
        sb.append(sb2.toString());
        r3f r3fVar = this.b;
        r3fVar.getClass();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\nTree of scopes:");
        r3f.a(sb3, r3fVar, 0);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
