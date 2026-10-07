package defpackage;

import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Laj2;", "Lru/ok/tamtam/exception/IssueKeyException;", "Lew5;", "minTimeout", "<init>", "(JLj95;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class aj2 extends IssueKeyException {
    private aj2(long j) {
        super(4, "22458", nbh.s(ew5.g(j), "Значение ожидание камеры должно быть больше 0 и больше ", "ms"), null);
    }

    public /* synthetic */ aj2(long j, j95 j95Var) {
        this(j);
    }
}
