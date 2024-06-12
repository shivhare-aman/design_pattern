package com.visitorPattern.visitor;

public interface Operation {
    // We should only use this when our object structure is very stable, but we need more frequent operations.
    void apply(HeadingNode headingNode);
    void apply(AnchorNode anchorNode);
}
