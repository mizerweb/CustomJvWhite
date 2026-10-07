package ru.ok.tamtam.contacts;

import defpackage.ww3;
import java.util.Collection;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ok/tamtam/contacts/MissedContactsException;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "", "contacts", "", "cause", "<init>", "(Ljava/util/Collection;Ljava/lang/Throwable;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MissedContactsException extends IssueKeyException {
    public final Collection a;

    public MissedContactsException(Collection<Long> collection, Throwable th) {
        super("6334", "missed contacts ".concat(ww3.z1(collection, null, null, null, null, 63)), th);
        this.a = collection;
    }
}
