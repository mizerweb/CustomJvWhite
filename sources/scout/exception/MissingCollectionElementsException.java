package scout.exception;

import defpackage.c54;
import defpackage.hg5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lscout/exception/MissingCollectionElementsException;", "Lscout/exception/ScoutException;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MissingCollectionElementsException extends ScoutException {
    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0026  */
    @Override // java.lang.Throwable
    public final String getMessage() {
        Object obj;
        StringBuilder sb = new StringBuilder("Missing elements of collection of ");
        StringBuilder sb2 = new StringBuilder("Collection(type=");
        c54 c54VarA = hg5.a();
        if (c54VarA != null) {
            c54VarA.a();
            obj = (String) c54VarA.c.get(0);
            if (obj == null) {
                obj = 0;
            }
        } else {
            obj = 0;
        }
        sb2.append(obj);
        sb2.append(')');
        sb.append(sb2.toString());
        throw null;
    }
}
