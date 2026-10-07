package defpackage;

import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh10;", "Lru/ok/tamtam/exception/IssueKeyException;", "Lf10;", "pipelineState", "<init>", "(Lf10;)V", "history-loader"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class h10 extends IssueKeyException {
    public h10(f10 f10Var) {
        super("ONEME-31884", "HistoryLoader skip pipelineState " + f10Var, null);
    }
}
