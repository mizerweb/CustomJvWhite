package ru.rustore.sdk.review.errors;

import kotlin.Metadata;
import ru.rustore.sdk.core.exception.RuStoreException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/review/errors/RuStoreReviewStartException;", "Lru/rustore/sdk/core/exception/RuStoreException;", "()V", "sdk-public-review_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RuStoreReviewStartException extends RuStoreException {
    public RuStoreReviewStartException() {
        super("Review activity can not start");
    }
}
