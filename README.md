# Java Bug: Off-by-One Error and Missing Exception Handling

This repository demonstrates a common Java programming error: an off-by-one error in array access, leading to an `ArrayIndexOutOfBoundsException`.  Additionally, the original code lacks proper exception handling.

The `BuggyCode.java` file contains the buggy code. The `CorrectedCode.java` file shows the corrected version with improved error handling.

The bug arises from the loop condition `i <= arr.length`.  Array indices start at 0 and go up to `arr.length -1`.  The loop should terminate when `i < arr.length`.

The corrected code addresses this error and includes a `try-catch` block to handle potential `ArrayIndexOutOfBoundsException`.