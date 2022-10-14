# How to use the GuardAI Platform Python API client

### Install the API client

```shell
pip install ./guardai_api
```

# Running the example code
### 1. Install the required example dependencies

```shell
pip install -r examples/requirements.txt
```

### 2. Configure the API credentials 
Edit the guardai-sdk-config.yml file to configure the API connection:
```yaml
version: 1

connection:
  # Ensure that the URL matches your GuardAI Platform deployment
  host: "https://guardai.navinfo.cloud"
  # Create an API key from your GuardAI Platform profile
  api-key-id: "keyid"
  api-key: "key"

```
### 3. Run the sample code

#### Listing project and test information 
```shell
./examples/list_projects.py
```
#### Starting a robustness test

```shell
./examples/start_robustness_test.py --test-id <test-id>
```
