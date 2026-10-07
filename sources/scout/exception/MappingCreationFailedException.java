package scout.exception;

import defpackage.dvk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lscout/exception/MappingCreationFailedException;", "Lscout/exception/ScoutException;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MappingCreationFailedException extends ScoutException {
    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "An error occurred during mapping creation of " + dvk.c() + " null";
    }
}
