# DSA Repository

This repository stores my Data Structures and Algorithms solutions for LeetCode and Codeforces.

## Structure
*   `leetcode/` - Automatically synced via GitHub Actions.
*   `codeforces/` - For Codeforces submissions.

## Setup Instructions for LeetCode Auto-Sync

1.  Push this repository to GitHub.
2.  Go to the repository's **Settings** -> **Secrets and variables** -> **Actions**.
3.  Add the following two repository secrets:
    *   `LEETCODE_CSRF_TOKEN`: Found in your browser cookies when logged into LeetCode.
    *   `LEETCODE_SESSION`: Found in your browser cookies when logged into LeetCode.
4.  Go to the repository's **Settings** -> **Actions** -> **General** -> **Workflow permissions**. Select **Read and write permissions** and click **Save**.
5.  Go to the **Actions** tab in your repository and manually trigger the "Sync Leetcode" workflow to run the first sync. After that, it will run automatically every day.

## A Note on Codeforces Auto-Sync
Unlike LeetCode, Codeforces heavily protects its submission source code behind Cloudflare. Because of this, GitHub Actions (which run on datacenter IPs) are usually blocked when trying to scrape Codeforces submissions server-side.

To auto-sync Codeforces, the most reliable method is to use a browser extension (like **Code-to-GitHub** in Orion/Chrome) that pushes to this `codeforces/` directory, rather than a GitHub Action.
